package com.projects.soccergoalperplayer.entity;


import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playerID;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name="LastName")
    private String lastName;

    @Column(name="FifaRecognizedGoals")
    private Integer fifaRecognizedGoals;

    @Column(name = "CurrentClub")
    private String currentClub;


    public Player() {}

    public Player(String firstName, String lastName, Integer fifaRecognizedGoals, String currentClub) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fifaRecognizedGoals = fifaRecognizedGoals;
        this.currentClub = currentClub;
    }

    //Getters and Setters

    public Long getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Long playerID) {
        this.playerID = playerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFifaRecognizedGoals() {
        return fifaRecognizedGoals;
    }

    public void setFifaRecognizedGoals(Integer fifaRecognizedGoals) {
        this.fifaRecognizedGoals = fifaRecognizedGoals;
    }

    public String getCurrentClub() {
        return currentClub;
    }

    public void setCurrentClub(String currentClub) {
        this.currentClub = currentClub;
    }
}
