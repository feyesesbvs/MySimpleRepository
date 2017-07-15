package com.jnshu.mapper;

import com.jnshu.pojo.Table1;

/**
 * Created by PC on 2017/7/15.
 */
public interface Table1Mapper {
    public Table1 findTable1ById(Long id ) throws Exception;
    public Table1 findTable1ByName(String name ) throws Exception;
    public Table1 findTable1ByOnlineId(String online_id  ) throws Exception;
    public void addTable1(Table1 table1 ) throws Exception;
    public void deleteTable1(Long id ) throws Exception;
    public void updateTable1(Table1 table1) throws Exception;
}
