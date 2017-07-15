package com.jnshu.mapper;

import com.jnshu.pojo.Table1;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by PC on 2017/7/15.
 */
public interface Table1Mapper {
    @Select("select * from table2 where id = #{id}")
    public Table1 findTable1ById(Long id ) throws Exception;

    @Select(  "SELECT  * FROM  table2 where name = #{name}")
    public Table1 findTable1ByName(String name ) throws Exception;

    @Select( " SELECT  * FROM  table2 where online_id = #{online_id}" )
    public Table1 findTable1ByOnlineId(String online_id  ) throws Exception;

    @Insert( " INSERT INTO table2( `name`, `qq`, `jobs`, `join_time`, `school`, `online_id`, `data_url`, `declaration`, `teacher`, `sources`) VALUES (#{name}, #{qq}, #{jobs}, #{join_time}, #{school}, #{online_id}, #{data_url}, #{declaration}, #{teacher}, #{sources})" )
    public void addTable1(Table1 table1 ) throws Exception;

    @Delete( "delete from table1 where id = #{id}" )
    public void deleteTable1(Long id ) throws Exception;

    @Update( "UPDATE  table2 set name=#{name}, qq=#{qq}, jobs=#{jobs}, join_time=#{join_time}, school=#{school}, online_id=#{online_id}, data_url=#{data_url}, declaration=#{declaration}, teacher=#{teacher}, sources=#{sources} where id=#{id}" )
    public void updateTable1(Long id) throws Exception;
}
