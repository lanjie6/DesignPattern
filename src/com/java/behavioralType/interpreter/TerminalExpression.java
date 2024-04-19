package com.java.behavioralType.interpreter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 解释器终结符表达类
 */
public class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data) {
        set.addAll(Arrays.asList(data));
    }

    public boolean interpret(String info) {
        return set.contains(info);
    }
}
