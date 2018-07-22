package com.qa.service.business;

import com.qa.persistence.repository.QuestionRepository;

import javax.inject.Inject;

public class QuestionServiceImpl implements QuestionService
{
    @Inject
    private QuestionRepository repo;

    @Override
    public String getAllQuestions() {
        return repo.getAllQuestions();
    }

    @Override
    public String getQuestionsByDifficulty(int difficulty) {
        return repo.getQuestionsByDifficulty(difficulty);
    }
}
