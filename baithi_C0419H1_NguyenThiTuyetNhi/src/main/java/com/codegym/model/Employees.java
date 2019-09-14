package com.codegym.model;

import org.checkerframework.common.aliasing.qual.Unique;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Size(min = 2,max = 20)
    @NotEmpty
    @Column(unique = true)
    private String code;
    @NotEmpty
    private String groupEmploy;
    @NotEmpty
    private String name;
    @NotEmpty
    private String sex;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthday;
    @Pattern(regexp = "^0(9|3|7|5|8)([0-9]{8})$")
    private String phoneNumber;
    @Size(min = 5,max = 50)
    @NotEmpty
    @Column(unique = true)
    @Email
    private String email;

    public Employees() {
    }

    public Employees(@NotEmpty String code, @NotEmpty String groupEmploy, @NotEmpty String name, @NotEmpty String sex, LocalDate birthday, @Pattern(regexp = "^0(9|3|7|5|8)([0-9]{8})$") String phoneNumber, @NotEmpty @Email String email) {
        this.code = code;
        this.groupEmploy = groupEmploy;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGroupEmploy() {
        return groupEmploy;
    }

    public void setGroupEmploy(String groupEmploy) {
        this.groupEmploy = groupEmploy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
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
}




