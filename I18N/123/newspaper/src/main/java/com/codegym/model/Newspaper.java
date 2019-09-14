package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "News")
public class Newspaper {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Size(max = 1000)
    private String tittleVi;
    @NotEmpty
    @Size(max = 1000)
    private String tittleEn;
    @NotEmpty

    private String contentVi;

    @NotEmpty

    private String contentEn;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Newspaper() {
    }

    public Newspaper(@NotEmpty  String contentVi, @NotEmpty String contentEn) {
        this.contentVi = contentVi;
        this.contentEn = contentEn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittleVi() {
        return tittleVi;
    }

    public void setTittleVi(String tittleVi) {
        this.tittleVi = tittleVi;
    }

    public String getTittleEn() {
        return tittleEn;
    }

    public void setTittleEn(String tittleEn) {
        this.tittleEn = tittleEn;
    }

    public String getContentVi() {
        return contentVi;
    }

    public void setContentVi(String contentVi) {
        this.contentVi = contentVi;
    }

    public String getContentEn() {
        return contentEn;
    }

    public void setContentEn(String contentEn) {
        this.contentEn = contentEn;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
