package com.telusko.quizapp.service;


import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
 QuestionRepository questionRepo;

    public List<Question> getAllquestions(){
       return questionRepo.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
return questionRepo.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionRepo.save(question);
        return "success";
    }
}
