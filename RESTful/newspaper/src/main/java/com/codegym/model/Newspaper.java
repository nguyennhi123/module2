package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name = "News")
public class Newspaper {
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
    @JoinColumn(name = "category_id")
    private Category category;


    public Newspaper() {
    }

    public Newspaper(@NotEmpty String content) {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    //    public Date getCreate() {
//        return create;
//    }
//
//    public void setCreate(Date create) {
//        this.create = create;
//    }
}
