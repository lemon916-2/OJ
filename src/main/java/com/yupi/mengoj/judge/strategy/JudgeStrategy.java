package com.yupi.mengoj.judge.strategy;

import com.yupi.mengoj.judge.codesandbox.model.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
