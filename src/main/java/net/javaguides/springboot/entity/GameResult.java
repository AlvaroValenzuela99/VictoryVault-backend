package net.javaguides.springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "game_result")
public class GameResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Game game;
    @ManyToOne
    private User winner;
    private int scorePlayer1;
    private int scorePlayer2;
}
