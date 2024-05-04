package com.java.principle;

/**
 * 聚合复用原则
 */
public class SyntheticMultiplexingDemo01 {

    public static void main(String[] args) {
        TestB testB = new TestB();
        testB.testMethod1();
        TestC testC = new TestC();
        testC.testMethod1();
        TestD testD = new TestD();
        //使用聚合的时候要注意避免空指针异常
        testD.setTestA(new TestA());
        testD.testMethod1();
        TestE testE = new TestE();
        testE.testMethod1(new TestA());
    }
}

class TestA {

    public void testMethod1() {
        System.out.println("执行了TestA的testMethod1方法……");
    }

}

//使用继承的方式去使用TestA的testMethod1方法。
class TestB extends TestA {

    public void testMethod1() {
        System.out.println("TestB：");
        super.testMethod1();
    }

}

//使用组合的方式去用使用TestA的testMethod1方法。
class TestC {

    private TestA testA = new TestA();

    public void testMethod1() {
        System.out.println("TestC：");
        testA.testMethod1();
    }

}

//使用聚合的方式去用使用TestA的testMethod1方法。
class TestD {

    private TestA testA;

    public void setTestA(TestA testA) {
        this.testA = testA;
    }

    public void testMethod1() {
        System.out.println("TestD：");
        testA.testMethod1();
    }

}

//使用依赖的方式去用使用TestA的testMethod1方法。
class TestE {

    public void testMethod1(TestA testA) {
        System.out.println("TestE：");
        testA.testMethod1();
    }

}
