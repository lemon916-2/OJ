package com.yupi.mengoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.mengoj.model.entity.Question;
import com.yupi.mengoj.service.QuestionService;
import com.yupi.mengoj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author ADMIN
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-07-01 16:35:14
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




