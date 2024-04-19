package com.java.structuralType.flyweight;

import java.sql.Connection;

/**
 * 使用享元模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/mybatis?serverTimezone=GMT%2B8&characterEncoding=utf8";
        String username = "root";
        String password = "123456";
        //创建连接池
        JDBCConnectionPool jdbcConnectionPool = JDBCConnectionPool
                .getJdbcConnectionPoolInstance(driverClassName, url, username, password);

        //获取连接
        Connection connection = jdbcConnectionPool.getConnection();
        System.out.println(connection);

        //归还连接
        jdbcConnectionPool.closeConnection(connection);
    }
}
