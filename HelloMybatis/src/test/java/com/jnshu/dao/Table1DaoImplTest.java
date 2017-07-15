package com.jnshu.dao;

import com.jnshu.pojo.Table1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by PC on 2017/7/15.
 */
public class Table1DaoImplTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findTable1ById() throws Exception {
        Table1Dao table1Dao =new Table1DaoImpl(sqlSessionFactory  );

        Table1 table1 =table1Dao.findTable1ById( 5l );
        System.out.println( table1 );
    }

    @Test
    public void findTable1ByName() throws Exception {
        Table1DaoImpl table1Dao =new Table1DaoImpl( sqlSessionFactory );
        Table1 table1 =table1Dao.findTable1ByName( "孙剑立" );
        System.out.println( table1 );
    }

    @Test
    public void findTable1ByOnlineId() throws Exception {
        Table1DaoImpl table1Dao =new Table1DaoImpl( sqlSessionFactory );
        Table1 table1 =table1Dao.findTable1ByOnlineId( "css-3141" );
        System.out.println( table1 );
    }

    @Test
    public void addTable1() throws Exception {
        Table1DaoImpl table1Dao =new Table1DaoImpl( sqlSessionFactory );
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
        table1Dao.addTable1( table1 );
    }

    @Test
    public void deleteTable1() throws Exception {
      Table1DaoImpl table1Dao = new Table1DaoImpl( sqlSessionFactory );
      table1Dao.deleteTable1( 21L );
    }

    @Test
    public void updateTable1() throws Exception {
        Table1DaoImpl table1Dao = new Table1DaoImpl( sqlSessionFactory );
        Table1 table1 = new Table1();
        table1.setName( "费玉清rap死吴亦凡" );
        table1.setQq( "啊实打实的" );
        table1.setJobs( "XXX-2156" );
        table1.setJoin_time( "2017年7月3日" );
        table1.setSchool( "家里蹲大学" );
        table1.setOnline_id( "888-asd" );
        table1.setData_url("WWW.XXX.COM");
        table1.setDeclaration( "w阿撒撒旦法" );
        table1.setTeacher( "asdasdasd" );
        table1.setSources( "asdsadasdf" );
        table1Dao.updateTable1( table1 );

    }

}