package com.java.createType.single;

import java.util.ArrayList;
import java.util.List;

/**
 * 该类是一个枚举类的演示
 */
public class Test {

    /**
     * 代表的是用户状态为：启用
     */
    public static final String ENABLE = "0";

    /**
     * 代表的是用户状态为：禁用
     */
    public static final String DISABLE = "1";

    public void test() {
        List<String> strings = new ArrayList<>();
        for (String string : strings) {
            if (Test.ENABLE.equals(string)) {
                //设置成启用状态给前端返回
            }else if (Test.DISABLE.equals(string)) {
                //设置成禁用状态给前端返回
            }
        }
    }

    public void test1() {
        List<String> strings = new ArrayList<>();
        for (String string : strings) {
            if (TestEnum.ENABLE.getCode().equals(string)) {
                String msg = TestEnum.ENABLE.getMsg();
            }else if (Test.DISABLE.equals(string)) {
                //设置成禁用状态给前端返回
            }
        }
    }
}
