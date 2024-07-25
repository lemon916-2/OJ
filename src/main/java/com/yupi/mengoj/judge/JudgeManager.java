package com.yupi.mengoj.judge;

import com.yupi.mengoj.judge.strategy.DefaultJudgeStrategy;
import com.yupi.mengoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.yupi.mengoj.judge.strategy.JudgeContext;
import com.yupi.mengoj.judge.strategy.JudgeStrategy;
import com.yupi.mengoj.judge.codesandbox.model.JudgeInfo;
import com.yupi.mengoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if (language.equals("java")) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
