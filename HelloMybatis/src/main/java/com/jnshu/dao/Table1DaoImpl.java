package com.jnshu.dao;

import com.jnshu.pojo.Table1;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by PC on 2017/7/15.
 */
public class Table1DaoImpl implements Table1Dao {


    private SqlSessionFactory sqlSessionFactory;
    public Table1DaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public Table1 findTable1ById(Long id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession( );
        Table1 table1 = sqlSession.selectOne( "Table1.findTable1ById", id );

        sqlSession.close( );
        return table1;
    }

    @Override
    public Table1 findTable1ByName(String name) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession( );
        Table1 table1 = sqlSession.selectOne( "Table1.findTable1ByName", name );
        sqlSession.close( );
        return table1;
    }

    @Override
    public Table1 findTable1ByOnlineId(String online_id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession( );
        Table1 table1 = sqlSession.selectOne( "Table1.findTable1ByOnlineId", online_id );
        sqlSession.close( );
        return table1;
    }

    @Override
    public void addTable1(Table1 table1) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession( );
        sqlSession.insert( "Table1.addTable1", table1 );
        sqlSession.commit( );
        sqlSession.close( );

    }
        @Override
        public void deleteTable1 (Long id) throws Exception {
            SqlSession sqlSession = sqlSessionFactory.openSession( );
            sqlSession.selectOne( "Table1.deleteTable1", id );
            sqlSession.commit( );
            sqlSession.close( );
        }
        @Override
        public void updateTable1 (Table1 table1) throws Exception {
            SqlSession sqlSession = sqlSessionFactory.openSession( );
            sqlSession.selectOne( "Table1.updateTable1", table1 );
            sqlSession.commit( );
            sqlSession.close( );
        }

    }


