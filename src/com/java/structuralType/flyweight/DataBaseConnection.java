package com.java.structuralType.flyweight;

import java.sql.Connection;

/**
 * 数据库连接接口（抽象享元角色）
 */
public interface DataBaseConnection {

    /**
     * 创建连接
     */
    Connection createConnection();

}
