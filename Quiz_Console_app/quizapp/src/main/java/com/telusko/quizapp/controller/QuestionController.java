package com.telusko.quizapp.controller;


import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService service;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
return service.getAllquestions();
    }

    @GetMapping("category/{cat}")
    public List<Question> getQuestionsByCategory(@PathVariable("cat") String category){
return service.getQuestionsByCategory(category);
    }


     @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
return service.addQuestion(question);
    }


}
