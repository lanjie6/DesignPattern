package com.java.behavioralType.template;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        //泡龙井茶
        System.out.println("----------泡龙井茶----------------");
        KungFuTea longjingTea = new LongJingTea();
        longjingTea.makeTea();

        //泡铁观音茶
        System.out.println("----------泡铁观音茶----------------");
        KungFuTea tieGuanYinTea = new TieGuanYinTea();
        tieGuanYinTea.makeTea();

        //泡碧螺春茶
        System.out.println("----------泡碧螺春茶----------------");
        KungFuTea biLuoChunTea = new BiLuoChunTea();
        biLuoChunTea.makeTea();
    }
}
