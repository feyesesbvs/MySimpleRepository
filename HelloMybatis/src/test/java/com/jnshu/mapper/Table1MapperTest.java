package com.jnshu.mapper;

import com.jnshu.pojo.Table1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by PC on 2017/7/15.
 */
public class Table1MapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        String resources = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
        // 创建SqlSessionFcatory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findTable1ById() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Table1Mapper table1Mapper = sqlSession.getMapper(Table1Mapper.class);
        Table1 table1 =table1Mapper.findTable1ById( 21L );
        System.out.println( table1 );
         sqlSession.close();
    }

    @Test
    public void findTable1ByName() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Table1Mapper table1Mapper = sqlSession.getMapper(Table1Mapper.class);
        Table1 table1=table1Mapper.findTable1ByName( "孙剑立" );
        System.out.println( table1 );
        sqlSession.close(); }

    @Test
    public void findTable1ByOnlineId() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Table1Mapper table1Mapper = sqlSession.getMapper(Table1Mapper.class);
        Table1 table1 =table1Mapper.findTable1ByOnlineId( "css-3141" );
        System.out.println( table1 );
        sqlSession.close();
    }


    @Test
    public void addTable1() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Table1 table1 = new Table1();
        table1.setName( "罗泽应怒抽吴亦凡" );
        table1.setQq( "8848616" );
        table1.setJobs( "XXX-2156" );
        table1.setJoin_time( "2017年7月3日" );
        table1.setSchool( "家里蹲大学" );
        table1.setOnline_id( "888-asd" );
        table1.setData_url("WWW.XXX.COM");
        table1.setDeclaration( "w阿撒撒旦法" );
        table1.setTeacher( "asdasdasd" );
        table1.setSources( "asdsadasdf" );
        Table1Mapper table1Mapper = sqlSession.getMapper( Table1Mapper.class );
        table1Mapper.addTable1( table1 );
        sqlSession.commit();
        sqlSession.close();
        System.out.println( Table1.getId());
    }

    @Test
    public void deleteTable1() throws Exception {
    SqlSession sqlSession =sqlSessionFactory.openSession();
    Table1Mapper table1Mapper = sqlSession.getMapper( Table1Mapper.class );
    table1Mapper.deleteTable1( 1050L );
    sqlSession.commit();
    sqlSession.close();

    }

    @Test
    public void updateTable1() throws Exception {
      SqlSession sqlSession = sqlSessionFactory.openSession();
        Table1 table1 = new Table1();
        table1.setId( 21L );
        table1.setName( "克里斯怒怼55开" );
        table1.setQq( "55开" );
        table1.setJobs( "卢本伟" );
        table1.setJoin_time( "2017年7月3日" );
        table1.setSchool( "家里蹲大学" );
        table1.setOnline_id( "888-asd" );
        table1.setData_url("WWW.XXX.COM");
        table1.setDeclaration( "w阿撒撒旦法" );
        table1.setTeacher( "asdasdasd" );
        table1.setSources( "asdsadasdf" );
        Table1Mapper mapper =sqlSession.getMapper( Table1Mapper.class );
        mapper.updateTable1( table1 );
        sqlSession.commit();
        System.out.println( Table1.getId());
        sqlSession.close();

    }

}