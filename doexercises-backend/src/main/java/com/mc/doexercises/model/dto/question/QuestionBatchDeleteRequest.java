package com.mc.doexercises.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ma Chao
 * @version 1.0
 * @date 2025-02-15 20:43
 */
@Data
public class QuestionBatchDeleteRequest implements Serializable {

    /**
     * 题目 id 列表
     */
    private List<Long> questionIdList;

    private static final long serialVersionUID = 1L;
}

