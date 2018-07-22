package com.qa.persistence.repository;

public interface QuestionRepository {
    String getAllQuestions();
    String getQuestionsByDifficulty(int difficulty);
}
