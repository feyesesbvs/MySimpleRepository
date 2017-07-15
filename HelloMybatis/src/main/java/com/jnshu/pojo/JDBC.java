package com.jnshu.pojo;

/**
 * Created by PC on 2017/7/13.
 */
/**public class JDBC {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://feyesesbvs.mysql.rds.aliyuncs.com:3306/db1";
    private static final String USER = "root";
    private static final String PASSWORD = "Lzy951227";

    public Connection getConnection(){
        Connection con = null;

        try{
            Class.forName( DRIVER );
            con = DriverManager.getConnection( URL,USER,PASSWORD );
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return con;
    }



}
 */