package com.telusko.quizapp.service;

import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.model.Quiz;
import com.telusko.quizapp.repository.QuestionRepository;
import com.telusko.quizapp.repository.QuizRepositoroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizRepositoroy quizRepo;

    @Autowired
    QuestionRepository questionRepo;
    public ResponseEntity<String> createQuiz(String category, int numQ, String title){
        List<Question> questions = questionRepo.findRandomQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizRepo.save(quiz);

        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
}
