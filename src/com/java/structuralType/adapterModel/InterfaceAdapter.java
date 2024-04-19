package com.java.structuralType.adapterModel;

/**
 * 接口适配器模式，也叫缺省适配器模式
 */
public class InterfaceAdapter {

    public static void main(String[] args) {
        //在某处需要使用到TestInterface的实现类
        test(new AbsClass() {
            @Override
            public void testMethod3() {
                super.testMethod3();
            }
        });
    }


    public static void test(TestInterface ti) {
        ti.testMethod3();
    }

}

//Target接口
interface TestInterface {

    void testMethod1();

    void testMethod2();

    void testMethod3();

    void testMethod4();

    void testMethod5();
}

//适配器角色
abstract class AbsClass implements TestInterface {

    @Override
    public void testMethod1() {

    }

    @Override
    public void testMethod2() {

    }

    @Override
    public void testMethod3() {

    }

    @Override
    public void testMethod4() {

    }

    @Override
    public void testMethod5() {

    }
}
