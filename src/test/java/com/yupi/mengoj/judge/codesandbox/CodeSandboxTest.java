package com.yupi.mengoj.judge.codesandbox;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.yupi.mengoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yupi.mengoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.mengoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.yupi.mengoj.model.enums.QuestionSubmitLanguageEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CodeSandboxTest {

    @Value("${codesandbox.type:example}")
    private String type;

    @Test
    void executeCode() {
        //利用接口调用示例沙箱
        CodeSandbox  codeSandbox = new ExampleCodeSandbox();
        String code = "int main() { }";
        String language = QuestionSubmitLanguageEnum.JAVA.getValue();
        List<String> inputList  = Arrays.asList("1 2","3 4");
        //Builder注解的快速赋值
        ExecuteCodeRequest executeCodeRequest = ExecuteCodeRequest.builder()
                .code(code)
                .language(language)
                .inputList(inputList)
                .build();
        //接收调用方法后的返回参数
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
      //断言判断是否为空
        Assertions.assertNotNull(executeCodeResponse);
    }
    @Test
    void executeCodeByValue() {
         //利用接口调用示例沙箱
        CodeSandbox  codeSandbox = CodeSandboxFactory.newInstance(type);
        String code = "int main() { }";
        String language = QuestionSubmitLanguageEnum.JAVA.getValue();
        List<String> inputList  = Arrays.asList("1 2","3 4");
        //Builder注解的快速赋值
        ExecuteCodeRequest executeCodeRequest = ExecuteCodeRequest.builder()
                .code(code)
                .language(language)
                .inputList(inputList)
                .build();
        //接收调用方法后的返回参数
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        //断言判断是否为空
        Assertions.assertNotNull(executeCodeResponse);
    }

    @Test
    void executeCodeByProxy() {
        //利用接口调用示例沙箱
        CodeSandbox  codeSandbox = CodeSandboxFactory.newInstance(type);
        codeSandbox = new CodeSandboxProxy(codeSandbox);
        String code = "int main() { }";
        String language = QuestionSubmitLanguageEnum.JAVA.getValue();
        List<String> inputList  = Arrays.asList("1 2","3 4");
        //Builder注解的快速赋值
        ExecuteCodeRequest executeCodeRequest = ExecuteCodeRequest.builder()
                .code(code)
                .language(language)
                .inputList(inputList)
                .build();
        //接收调用方法后的返回参数
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        //断言判断是否为空
        Assertions.assertNotNull(executeCodeResponse);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String type = scanner.next();
            CodeSandbox  codeSandbox = CodeSandboxFactory.newInstance(type);
            String code = "int main() { }";
            String language = QuestionSubmitLanguageEnum.JAVA.getValue();
            List<String> inputList  = Arrays.asList("1 2","3 4");
            //Builder注解的快速赋值
            ExecuteCodeRequest executeCodeRequest = ExecuteCodeRequest.builder()
                    .code(code)
                    .language(language)
                    .inputList(inputList)
                    .build();
            //接收调用方法后的返回参数
            ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        }
    }
}