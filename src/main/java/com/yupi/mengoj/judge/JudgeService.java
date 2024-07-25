package com.yupi.mengoj.judge;

import com.yupi.mengoj.model.entity.QuestionSubmit;
import com.yupi.mengoj.model.vo.QuestionSubmitVO;

/**
 * 判题服务
 * */
public interface JudgeService {

    /**
     * 判题
     * */
    QuestionSubmit doJudge(long questionSubmitId);
}
