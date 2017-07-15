package com.jnshu.utils;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by PC on 2017/7/15.
 */
public class MybatisUtil {
    public static SqlSessionFactory getFactory(){
        String resource = "mybatis-config.xml";
        InputStream inputStream1=MybatisUtil.class.getClassLoader().getResourceAsStream( resource );
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build( inputStream1 );
        return sqlSessionFactory;
    }
}
