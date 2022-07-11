package br.com.aulaapi.entities;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity

public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String number;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user_id;

}
