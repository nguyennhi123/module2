package com.codegym.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
    @NotEmpty
    @Size(min = 5,max = 45)
    private String lastName;
    @Size(min = 5,max = 45)
    private String firstName;
    @Min(18)
    private int age;
    private String phoneNumber;
    private String email;

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
        return Phone.class.isAssignableFrom(clazz);

    }
    @Override
    public void validate(Object target, Errors error){
        phoneNumber = (phoneNumber) target;
        String number = phone.getNumber();
        ValidationUtils.rejectIfEmpty(error,"number","number.empty");
        if (number.length()>11 || number.length()<10){
            error.rejectValue("number", "number.length");
        }
        if (!number.startsWith("0")){
            error.rejectValue("number", "number.startsWith");
        }
        if (!number.matches("(^$|[0-9]*$)")){
            error.rejectValue("number", "number.matches");
        }
    }
}
