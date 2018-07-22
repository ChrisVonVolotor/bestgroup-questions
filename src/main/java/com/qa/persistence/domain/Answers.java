package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answers {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;
    private int answerPosition;
    private String answerCodeSnippet;


}
