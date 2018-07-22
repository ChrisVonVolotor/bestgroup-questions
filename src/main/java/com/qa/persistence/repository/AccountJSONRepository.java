package com.qa.persistence.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@ApplicationScoped
@Alternative
public class AccountJSONRepository implements QuestionRepository {
    @Override
    public String getAllQuestions() {
        return null;
    }

    @Override
    public String getQuestionsByDifficulty(int difficulty) {
        return null;
    }
}
