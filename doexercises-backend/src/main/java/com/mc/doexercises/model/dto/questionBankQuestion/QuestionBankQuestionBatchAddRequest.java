package com.mc.doexercises.model.dto.questionBankQuestion;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ma Chao
 * @version 1.0
 * @date 2025-02-15 17:39
 */
@Data
public class QuestionBankQuestionBatchAddRequest implements Serializable {

    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id 列表
     */
    private List<Long> questionIdList;

    private static final long serialVersionUID = 1L;
}

