package net.javaguides.springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "teamName")
    private String teamName;
    @JoinColumn(name = "captain_id")
    @OneToOne
    private User captain;
    @JoinColumn(name = "playerTwo_id")
    @OneToOne
    private User playerTwo;
    @JoinColumn(name = "playerThree_id")
    @OneToOne
    private User playerThree;
    @JoinColumn(name = "playerFour_id")
    @OneToOne
    private User playerFour;
    @JoinColumn(name = "playerFive_id")
    @OneToOne
    private User playerFive;

    public Team() {
    }

    public Team(Long id, String teamName, User captain, User playerTwo, User playerThree, User playerFour, User playerFive) {
        this.id = id;
        this.teamName = teamName;
        this.captain = captain;
        this.playerTwo = playerTwo;
        this.playerThree = playerThree;
        this.playerFour = playerFour;
        this.playerFive = playerFive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public User getCaptain() {
        return captain;
    }

    public void setCaptain(User captain) {
        this.captain = captain;
    }

    public User getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(User playerTwo) {
        this.playerTwo = playerTwo;
    }

    public User getPlayerThree() {
        return playerThree;
    }

    public void setPlayerThree(User playerThree) {
        this.playerThree = playerThree;
    }

    public User getPlayerFour() {
        return playerFour;
    }

    public void setPlayerFour(User playerFour) {
        this.playerFour = playerFour;
    }

    public User getPlayerFive() {
        return playerFive;
    }

    public void setPlayerFive(User playerFive) {
        this.playerFive = playerFive;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                ", captain=" + captain +
                ", playerTwo=" + playerTwo +
                ", playerThree=" + playerThree +
                ", playerFour=" + playerFour +
                ", playerFive=" + playerFive +
                '}';
    }
}
