package com.yupi.mengoj.service;

import com.yupi.mengoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.mengoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.mengoj.model.entity.User;

/**
* @author ADMIN
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-07-01 16:36:25
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {


    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);


}
