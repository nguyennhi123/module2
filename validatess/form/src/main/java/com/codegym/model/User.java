package com.codegym.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User implements Validator {
    @NotEmpty
    @Size(min = 5,max = 45)
    private String lastName;
    @NotEmpty
    @Size(min = 5,max = 45)
    private String firstName;
    @Min(18)
    private int age;
    private String phoneNumber;
    @NotEmpty
    @Email
    private String email;

    public User() {
    }

    public User(@NotEmpty @Size(min = 5, max = 45) String lastName, @NotEmpty @Size(min = 5, max = 45) String firstName, @Min(18) int age, String phoneNumber, @NotEmpty String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public boolean supports(Class<?>clazz){
        return User.class.isAssignableFrom(clazz);

    }
    @Override
    public void validate(Object target, Errors error){
        User user = (User) target;
        String phoneNumber = user.getPhoneNumber();
        ValidationUtils.rejectIfEmpty(error,"phoneNumber","phoneNumber.empty");
        ValidationUtils.rejectIfEmpty(error,"email","email.empty");
        if (phoneNumber.length()>11 || phoneNumber.length()<10){
            error.rejectValue("phoneNumber", "phoneNumber.length");
        }
        if (!phoneNumber.startsWith("0")){
            error.rejectValue("phoneNumber", "phoneNumber.startsWith");
        }
        if (!phoneNumber.matches("(^$|[0-9]*$)")){
            error.rejectValue("phoneNumber", "phoneNumber.matches");
        }

    }
}
