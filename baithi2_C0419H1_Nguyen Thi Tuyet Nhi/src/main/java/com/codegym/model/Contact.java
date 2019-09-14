package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name ="contact" )
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @Pattern(regexp = "^0(9|3|7|5|8)([0-9]{8})$")
    @Column(unique = true)
    private String phoneNumber;
    @NotEmpty
    @Email
    @Column(unique = true)
    @Size(min = 10,max = 50)
    private String email;
    @NotEmpty
    private String address;

    public Contact() {
    }

    public Contact(@NotEmpty String firstName, @NotEmpty String lastName, @Pattern(regexp = "^0(9|3|7|5|8)([0-9]{8})$") @Size(min = 10, max = 50) String phoneNumber, @NotEmpty @Email @Size(min = 10, max = 50) String email, @NotEmpty String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
