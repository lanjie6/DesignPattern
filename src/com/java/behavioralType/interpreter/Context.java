package com.java.behavioralType.interpreter;

/**
 * 环境类
 */
public class Context {

    //定义免费解析的城市
    private String[] cities = {"成都", "广州"};

    //定义解析的人群
    private String[] persons = {"老人", "妇女", "儿童"};

    private Expression cityPerson;

    public Context() {
        Expression city = new TerminalExpression(cities);
        Expression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city, person);
    }

    public void freeRide(String info) {
        boolean ok = cityPerson.interpret(info);
        if (ok) {
            System.out.println("您是" + info + "，您本次乘车免费！");
        } else {
            System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
        }
    }
}
