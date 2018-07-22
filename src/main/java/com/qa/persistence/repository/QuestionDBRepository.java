package com.qa.persistence.repository;

import com.qa.persistence.domain.Question;
import com.qa.util.JSONUtil;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import java.util.Collection;
import com.qa.persistence.domain.Question;


import static javax.transaction.Transactional.TxType.SUPPORTS;

@Transactional(SUPPORTS)
@Default
public class QuestionDBRepository implements QuestionRepository {
   @PersistenceContext(unitName = "primary")
   private EntityManager manager;
   @Inject
   private JSONUtil util;



    @Override
    public String getAllQuestions() {
        Query query = manager.createQuery("Select a FROM Question a");
        Collection<Question> questions = (Collection<Question>) query.getResultList();
        return util.getJSONForObject(questions);
    }

    @Override
    public String getQuestionsByDifficulty(int difficulty) {
        Query query = manager.createQuery("Select a FROM Question a WHERE levelDifficulty = " + difficulty);
        Collection<Question> questions = (Collection<Question>) query.getResultList();
        return util.getJSONForObject(questions);
    }
}
