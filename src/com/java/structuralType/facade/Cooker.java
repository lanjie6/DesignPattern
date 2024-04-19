package com.java.structuralType.facade;

/**
 * 模拟厨师对象
 */
public class Cooker {

    private Shop shop = new Shop();

    private Water water = new Water();

    private FoodKnife fk = new FoodKnife();

    private IronPan pan = new IronPan();

    private Stove stove = new Stove();

    private Bowl bowl = new Bowl();

    /**
     * 烹饪方法
     */
    public void cooking() {
        //从菜市场将食材买到
        Food food = shop.getFood();
        //对食材进行清洗
        water.wash(food);
        //将食材用菜刀进行切加工
        fk.cut(food);
        //将切好的食材放入铁锅中
        pan.makeIn(food);
        //将灶台点火并将装有食材的铁锅放上去进行煎炒
        stove.fireUpAndPlace(pan, food);
        //煎炒完毕放入碗中可以吃了
        bowl.makeIn(food);
    }
}
