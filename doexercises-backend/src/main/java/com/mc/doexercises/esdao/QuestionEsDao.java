package com.mc.doexercises.esdao;

/**
 * @author Ma Chao
 * @version 1.0
 * @date 2025-02-15 16:31
 */

import com.mc.doexercises.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 题目 ES 操作
 */
public interface QuestionEsDao
        extends ElasticsearchRepository<QuestionEsDTO, Long> {

}

