package com.java.structuralType.combination;

/**
 * 使用组合模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        Bags bigBag = new Bags("大商品袋");
        Bags mediumBag = new Bags("中商品袋");
        Bags smallBag = new Bags("小商品袋");

        Goods sneakers = new Goods("运动鞋", 1, 1198);
        Goods snacks = new Goods("零食", 5, 5);
        Goods vegetables = new Goods("蔬菜", 5, 1.5);

        //中商品袋中放入运动鞋
        mediumBag.add(sneakers);
        //小商品袋中放入零食和蔬菜
        smallBag.add(snacks);
        smallBag.add(vegetables);
        //把中商品袋和小商品袋一起放入大商品袋组合起来
        bigBag.add(mediumBag);
        bigBag.add(smallBag);
        //打印所有的商品信息
        bigBag.show();
        double total = bigBag.calculation();
        System.out.println("要支付的总价是:" + total);
    }
}
