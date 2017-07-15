package com.jnshu.pojo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by feyesesbvs on 2017/7/12.
 */
public class MyBatisTest {

    @Test
    public void findTable1ById() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession sqlSession = null;

        inputStream = Resources.getResourceAsStream( resource );
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder( ).build( inputStream );
        sqlSession = sqlSessionFactory.openSession( );

        Table1 table1 = sqlSession.selectOne( "Table1.findTable1ById", 5 );
        System.out.println( table1.toString() );
        sqlSession.close( );
    }

    @Test
    public void findTable1ByName() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession sqlSession = null;

        inputStream = Resources.getResourceAsStream( resource );
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder( ).build( inputStream );
        sqlSession = sqlSessionFactory.openSession( );

        Table1 table1 = sqlSession.selectOne( "Table1.findTable1ByName", "孙剑立" );
        System.out.println( table1 );
        sqlSession.close( );
    }
    @Test
    public void findTable1ByOnlineId() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession sqlSession = null;

        inputStream = Resources.getResourceAsStream( resource );
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder( ).build( inputStream );
        sqlSession = sqlSessionFactory.openSession( );

        Table1 table1 = sqlSession.selectOne( "Table1.findTable1ByOnlineId", "css-3141" );
        System.out.println( table1 );
        sqlSession.close( );
    }

    @Test
    public void addTable1() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession sqlSession = null;

        inputStream = Resources.getResourceAsStream( resource );
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder( ).build( inputStream );
        sqlSession = sqlSessionFactory.openSession( );

        Table1 table1 = new Table1();
        table1.setName( "赵本山怒抽吴亦凡" );
        table1.setQq( "8848616" );
        table1.setJobs( "XXX-2156" );
        table1.setJoin_time( "2017年7月3日" );
        table1.setSchool( "家里蹲大学" );
        table1.setOnline_id( "888-asd" );
        table1.setData_url("WWW.XXX.COM");
        table1.setDeclaration( "w阿撒撒旦法" );
        table1.setTeacher( "asdasdasd" );
        table1.setSources( "asdsadasdf" );

    sqlSession.insert( "Table1.addTable1",table1 );
    System.out.println( Table1.getId() );

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateTable1() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession sqlSession = null;

        inputStream = Resources.getResourceAsStream( resource );
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder( ).build( inputStream );
        sqlSession = sqlSessionFactory.openSession( );

        Table1 table1 = new Table1();
        table1.setId( 45 );
        table1.setName( "赵本山怒抽吴亦凡" );
        table1.setQq( "8848616" );
        table1.setJobs( "XXX-2156" );
        table1.setJoin_time( "2017年7月3日" );
        table1.setSchool( "家里蹲大学" );
        table1.setOnline_id( "888-asd" );
        table1.setData_url("WWW.XXX.COM");
        table1.setDeclaration( "w阿撒撒旦法" );
        table1.setTeacher( "asdasdasd" );
        table1.setSources( "asdsadasdf" );


        sqlSession.update( "Table1.updateTable1",table1 );

        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void deleteTable1() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession sqlSession = null;

        inputStream = Resources.getResourceAsStream( resource );
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder( ).build( inputStream );
        sqlSession = sqlSessionFactory.openSession( );

        Table1 table1 = sqlSession.selectOne( "Table1.deleteTable1", 20L );
        sqlSession.commit( );
        sqlSession.close();

    }
}


