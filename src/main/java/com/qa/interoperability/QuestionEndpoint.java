package com.qa.interoperability;

import com.qa.service.business.QuestionService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

@Path("/question")
public class QuestionEndpoint {
    @Inject
    private QuestionService service;

    @Path("/json")
    @GET
    @Produces({ "application/json" })
    public String getAllQuestions() {
        return service.getAllQuestions();
    }

    @Path("/json/{difficulty}")
    @GET
    @Produces({ "application/json" })
    public String getAllQuestions(@PathParam("difficulty") int difficulty) {
        return service.getQuestionsByDifficulty(difficulty);
    }
}
