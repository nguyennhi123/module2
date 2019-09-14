package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "theloai")
public class Theloai {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    @Size(max = 100)
    private String name;

    @OneToMany(mappedBy = "theloai")
    private Set<Tintuc> tintuc;

    public Theloai() {
    }

    public Theloai(@NotEmpty @Size(max = 100) String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Tintuc> getTintuc() {
        return tintuc;
    }

    public void setTintuc(Set<Tintuc> tintuc) {
        this.tintuc = tintuc;
    }
}
