package com.java.structuralType.decorator;

/**
 * 使用装饰者模式
 */
public class Client {

    public static void main(String[] args) {
        //吃牛肉鸡蛋面
        Noodles noodles1 = new BeefNoodles();
        noodles1 = new Egg(noodles1);
        //点一份牛肉鸡蛋火腿肠面
        noodles1 = new HamSausage(noodles1);
        System.out.println("吃" + noodles1.getDesc() + "的价格是：" + noodles1.cost() + "元");

        //吃普通热干面
        Noodles noodles2 = new HotDryNoodles();
        System.out.println("吃" + noodles2.getDesc() + "的价格是：" + noodles2.cost() + "元");
    }
}
