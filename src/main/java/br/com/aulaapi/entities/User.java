package br.com.aulaapi.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class User {

    @Id
    private Long id;

    @Basic
    private String name;

    @Basic
    private Integer age;

    @OneToMany(mappedBy = "id")
    private List<Phone> phones = new ArrayList<>();
}
