package com.jnshu.mapper;

import com.jnshu.pojo.Table1;
import com.jnshu.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * Created by PC on 2017/7/15.
 */
public class Table1MapperTest {
    @Test
    public void findTable1ById() throws Exception {
     SqlSessionFactory sqlSessionFactory= MybatisUtil.getFactory();
        SqlSession sqlSession =sqlSessionFactory.openSession();
        Table1Mapper table1Mapper=sqlSession.getMapper( Table1Mapper.class );
       Table1 table1= table1Mapper.findTable1ById( 9L );

        System.out.println(table1.toString() );
        sqlSession.close();

    }

    @Test
    public void findTable1ByName() throws Exception {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getFactory();
        SqlSession sqlSession =sqlSessionFactory.openSession();
        Table1Mapper table1Mapper=sqlSession.getMapper( Table1Mapper.class );
        Table1 table1=table1Mapper.findTable1ByName( "刘家铭" );
        sqlSession.close();

    }

    @Test
    public void findTable1ByOnlineId() throws Exception {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getFactory();
        SqlSession sqlSession =sqlSessionFactory.openSession();
        Table1Mapper table1Mapper=sqlSession.getMapper( Table1Mapper.class );
        Table1 table1=table1Mapper.findTable1ByOnlineId( "css-3097" );
        sqlSession.close();

    }

    @Test
    public void addTable1() throws Exception {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getFactory();
        SqlSession sqlSession =sqlSessionFactory.openSession();
        Table1Mapper table1Mapper=sqlSession.getMapper( Table1Mapper.class );
        //table1Mapper.addTable1( new Table1( "1","1","asd","sdaf","123456","543","546","456","456","546","456","456"));
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
        table1Mapper.addTable1( table1 );
        sqlSession.commit();
        sqlSession.close();
        System.out.println( table1.getName() );


    }

    @Test
    public void deleteTable1() throws Exception {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getFactory();
        SqlSession sqlSession =sqlSessionFactory.openSession();
        Table1Mapper table1Mapper=sqlSession.getMapper( Table1Mapper.class );
        table1Mapper.deleteTable1( 25L );

        sqlSession.close();

    }

    @Test
    public void updateTable1() throws Exception {
        SqlSessionFactory sqlSessionFactory= MybatisUtil.getFactory();
        SqlSession sqlSession =sqlSessionFactory.openSession();
        Table1Mapper table1Mapper=sqlSession.getMapper( Table1Mapper.class );
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
        table1Mapper.updateTable1( 21L );
        sqlSession.commit();
        sqlSession.close();
        System.out.println( Table1.getId());
    }

}