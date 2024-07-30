package com.lemon.mengojbackendquestionservice.controller.inner;

import com.lemon.mengojbackendmodel.model.entity.Question;
import com.lemon.mengojbackendmodel.model.entity.QuestionSubmit;
import com.lemon.mengojbackendquestionservice.service.QuestionService;
import com.lemon.mengojbackendquestionservice.service.QuestionSubmitService;
import com.lemon.mengojbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 *  该服务仅内部调用，不是给前端的
 * */

@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {


    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Override
    @GetMapping("/get/id")
    public Question getQuestionById(@RequestParam("questionId") long questionId){
return questionService.getById(questionId);
    }

    @Override
    @GetMapping("/question_submit/get/id")
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") long questionSubmitId){
return questionSubmitService.getById(questionSubmitId);
    }

    @Override
    @PostMapping("/question_submit/update")
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit){
return questionSubmitService.updateById(questionSubmit);
    }
}
