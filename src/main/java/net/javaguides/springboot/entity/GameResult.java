package net.javaguides.springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "game_result")
public class GameResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @JoinColumn(name = "game_id")
    @OneToOne
    private Game game;
    @JoinColumn(name = "name_id")
    @OneToOne
    private User winner;
    @Column(name = "scorePlayer1")
    private int scorePlayer1;
    @Column(name = "scorePlayer2")
    private int scorePlayer2;

    public GameResult() {
    }

    public GameResult(Long id, Game game, User winner, int scorePlayer1, int scorePlayer2) {
        this.id = id;
        this.game = game;
        this.winner = winner;
        this.scorePlayer1 = scorePlayer1;
        this.scorePlayer2 = scorePlayer2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public User getWinner() {
        return winner;
    }

    public void setWinner(User winner) {
        this.winner = winner;
    }

    public int getScorePlayer1() {
        return scorePlayer1;
    }

    public void setScorePlayer1(int scorePlayer1) {
        this.scorePlayer1 = scorePlayer1;
    }

    public int getScorePlayer2() {
        return scorePlayer2;
    }

    public void setScorePlayer2(int scorePlayer2) {
        this.scorePlayer2 = scorePlayer2;
    }

    @Override
    public String toString() {
        return "GameResult{" +
                "id=" + id +
                ", game=" + game +
                ", winner=" + winner +
                ", scorePlayer1=" + scorePlayer1 +
                ", scorePlayer2=" + scorePlayer2 +
                '}';
    }
}
