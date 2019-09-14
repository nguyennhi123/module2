package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tintuc")
public class Tintuc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Size(max = 1000)
    private String tittle;

    @NotEmpty

    private String content;

    //    @Column(updatable = false)
//    @CreationTimestamp
//    private Date create;
    @ManyToOne
    @JoinColumn(name = "theloai_id")
    private Theloai theloai;


    public Tintuc() {
    }

    public Tintuc(@NotEmpty String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Theloai getTheloai() {
        return theloai;
    }

    public void setTheloai(Theloai theloai) {
        this.theloai = theloai;
    }
//    public Date getCreate() {
//        return create;
//    }
//
//    public void setCreate(Date create) {
//        this.create = create;
//    }
}
