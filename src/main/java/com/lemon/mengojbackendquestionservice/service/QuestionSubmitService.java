package com.lemon.mengojbackendquestionservice.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lemon.mengojbackendmodel.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.lemon.mengojbackendmodel.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.lemon.mengojbackendmodel.model.entity.QuestionSubmit;
import com.lemon.mengojbackendmodel.model.entity.User;
import com.lemon.mengojbackendmodel.model.vo.QuestionSubmitVO;

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


    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);


}
