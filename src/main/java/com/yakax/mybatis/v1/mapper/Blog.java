package com.yakax.mybatis.v1.mapper;

import lombok.Data;

import java.io.Serializable;

@Data
public class Blog implements Serializable {
    /**
     * 文章ID
     */
    Integer bid;
    /**
     * 文章标题
     */
    String name;
    /**
     * 文章作者ID
     */
    Integer authorId;
}
