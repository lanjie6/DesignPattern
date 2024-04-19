package com.java.structuralType.flyweight;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * JDBC数据库连接池（享元工厂角色）
 */
public class JDBCConnectionPool {

    //维护数据库连接的集合
    private final List<Connection> connectionList = new ArrayList<>();

    //持有一个静态的连接池对象
    private volatile static JDBCConnectionPool jdbcConnectionPool;

    /**
     * 私有构造器
     */
    private JDBCConnectionPool(String driverClassName, String url, String username, String password) {
        if (jdbcConnectionPool != null) {
            throw new RuntimeException();
        }
        //初始化连接数，这里默认先写死10个
        for (int i = 0; i < 10; i++) {
            JDBCConnection jdbcConnection = new JDBCConnection(driverClassName, url, username, password);
            Connection connection = jdbcConnection.createConnection();
            connectionList.add(connection);
        }
    }

    /**
     * 返回相同的连接池对象
     */
    public static JDBCConnectionPool getJdbcConnectionPoolInstance(String driverClassName
            , String url, String username, String password) {
        if (jdbcConnectionPool == null) {
            synchronized (JDBCConnectionPool.class) {
                if (jdbcConnectionPool == null) {
                    jdbcConnectionPool = new JDBCConnectionPool(driverClassName, url, username, password);
                }
            }
        }
        return jdbcConnectionPool;
    }

    /**
     * 获取数据库连接
     */
    public Connection getConnection() {
        //如果集合中还有连接，就获取一个返回给用户
        synchronized (JDBCConnectionPool.class) {
            if (!connectionList.isEmpty()) {
                Connection connection = connectionList.get(0);
                connectionList.remove(connection);
                return connection;
            }
        }
        //如果集合中没有连接了，那么就递归调用，等待有连接被归还
        return getConnection();
    }

    /**
     * 关闭连接（本质上是把连接放回集合中）
     */
    public void closeConnection(Connection connection) {
        connectionList.add(connection);
    }
}
