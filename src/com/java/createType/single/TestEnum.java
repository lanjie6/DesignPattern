package com.java.createType.single;

/**
 * 模拟一个用户状态的枚举类
 */
public enum TestEnum {

    ENABLE("0", "启用"),
    DISABLE("1", "禁用");


    private String code;
    private String msg;

    TestEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
