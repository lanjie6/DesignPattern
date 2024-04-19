package com.java.behavioralType.interpreter;

/**
 * 解释器非终结符表达类
 */
public class AndExpression implements Expression {

    //地市
    private Expression city;

    //人群
    private Expression person;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    public boolean interpret(String info) {
        String[] s = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
