package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String name;
    @Min(18)
    private int age;
    @NotEmpty(message = "không được để trống")
    private String address;
    @Size(min = 5,max = 50)
    @Column(unique = true)
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Size(min = 2,max = 20)
    @Column(unique = true)
    private String idCard;
    @NotEmpty
    private String job;
    @NotEmpty
    private String province;

    public Customer() {
    }

    public Customer(@NotEmpty String name, @NotEmpty @Min(18) int age, @NotEmpty String address, @Email String email, @NotEmpty @Size(min = 9, max = 20) String idCard, @NotEmpty String job, @NotEmpty String province) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.idCard = idCard;
        this.job = job;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
