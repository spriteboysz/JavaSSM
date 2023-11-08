package com.deean.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Author: Deean
 * Date: 2023-11-06 22:35
 * FileName: src/main/java/com/deean/utils
 * Description:
 */

public class MyBatisUtil {
    public static SqlSessionFactory factory;
    public static final ThreadLocal<SqlSession> local = new ThreadLocal<>();

    static {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return factory;
    }

    public static SqlSession getSqlSession(boolean isAutoCommit) {
        SqlSession sqlSession = local.get();
        if (sqlSession == null) {
            sqlSession = factory.openSession(isAutoCommit);
            local.set(sqlSession);
        }
        return sqlSession;
    }

    public static SqlSession getSqlSession() {
        return getSqlSession(false);
    }

    public static <T> T getMapper(Class<T> c) {
        SqlSession sqlSession = getSqlSession();
        return sqlSession.getMapper(c);
    }
}
