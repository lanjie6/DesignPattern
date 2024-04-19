package com.java.structuralType.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * JDBC数据库连接（具体享元角色）
 */
public class JDBCConnection implements DataBaseConnection {
    /**
     * 数据库驱动
     */
    private final String driverClassName;

    /**
     * 数据库url
     */
    private final String url;

    /**
     * 数据库密码
     */
    private final String username;

    /**
     * 数据库密码
     */
    private final String password;

    /**
     * 初始化数据库信息（非享元角色）
     */
    public JDBCConnection(String driverClassName, String url, String username, String password) {
        this.driverClassName = driverClassName;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public Connection createConnection() {
        try {
            Class.forName(driverClassName);
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
