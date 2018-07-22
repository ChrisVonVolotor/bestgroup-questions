package com.qa.persistence.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private int levelDifficulty;
    private int levelPosition;
    private String levelNumber;
    private String levelName;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="answers_id")
    private List<Answers> solution;
    private int timer;
    private int chances;


    public Question(){

    }

    public Question(Long id, int levelDifficulty,int levelPosition, String levelNumber, String levelName, List<Answers> solution, int timer, int chances){
        this.id=id;
        this.levelName=levelName;
        this.levelDifficulty=levelDifficulty;
        this.levelPosition=levelPosition;
        this.levelNumber=levelNumber;
        this.solution=solution;
        this.chances=chances;
        this.timer=timer;
    }

    public int getChances() {
        return chances;
    }

    public int getLevelPosition() {
        return levelPosition;
    }

    public int getTimer() {
        return timer;
    }

    public int getLevelDifficulty() {
        return levelDifficulty;
    }

    public Long getId() {
        return id;
    }

    public String getLevelName() {
        return levelName;
    }

    public String getLevelNumber() {
        return levelNumber;
    }

    public List<Answers> getSolution() {
        return solution;
    }

    @Override
    public String toString() {
        return levelNumber + ": " + levelName;
    }
}

