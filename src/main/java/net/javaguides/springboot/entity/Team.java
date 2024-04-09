package net.javaguides.springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String teamName;
    private User captain;
    private User playerTwo;
    private User playerThree;
    private User playerFour;
    private User playerFive;

}
