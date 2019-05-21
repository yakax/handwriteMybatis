package com.yakax.mybatis.v1;

import com.yakax.mybatis.v1.mapper.BlogMapper;

public class MyBatisBoot {
    public static void main(String[] args) {
        SqlSession sqlSession = new SqlSession(new Configuration(), new Executor());
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        blogMapper.selectBlogById(1);
    }
}
