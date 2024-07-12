package com.yupi.mengoj.judge.codesandbox;


import com.yupi.mengoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.mengoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 * */

public interface CodeSandbox {

    /**
     * 执行代码
     * */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
