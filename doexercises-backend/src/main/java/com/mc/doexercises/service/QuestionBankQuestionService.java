package com.mc.doexercises.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mc.doexercises.model.dto.questionBankQuestion.QuestionBankQuestionQueryRequest;
import com.mc.doexercises.model.entity.QuestionBankQuestion;
import com.mc.doexercises.model.entity.User;
import com.mc.doexercises.model.vo.QuestionBankQuestionVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 题库题目关联服务
 *
 * @author machao
 */
public interface QuestionBankQuestionService extends IService<QuestionBankQuestion> {

    void batchAddQuestionsToBank(List<Long> questionIdList, Long questionBankId, User loginUser);

    /**
     * 校验数据
     *
     * @param questionBankQuestion
     * @param add 对创建的数据进行校验
     */
    void validQuestionBankQuestion(QuestionBankQuestion questionBankQuestion, boolean add);

    /**
     * 获取查询条件
     *
     * @param questionBankQuestionQueryRequest
     * @return
     */
    QueryWrapper<QuestionBankQuestion> getQueryWrapper(QuestionBankQuestionQueryRequest questionBankQuestionQueryRequest);
    
    /**
     * 获取题库题目关联封装
     *
     * @param questionBankQuestion
     * @param request
     * @return
     */
    QuestionBankQuestionVO getQuestionBankQuestionVO(QuestionBankQuestion questionBankQuestion, HttpServletRequest request);

    /**
     * 分页获取题库题目关联封装
     *
     * @param questionBankQuestionPage
     * @param request
     * @return
     */
    Page<QuestionBankQuestionVO> getQuestionBankQuestionVOPage(Page<QuestionBankQuestion> questionBankQuestionPage, HttpServletRequest request);

    void batchRemoveQuestionsFromBank(List<Long> questionIdList, Long questionBankId);

    void batchAddQuestionsToBankInner(List<QuestionBankQuestion> questionBankQuestions);
}
