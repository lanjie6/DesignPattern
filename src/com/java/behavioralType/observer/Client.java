package com.java.behavioralType.observer;

/**
 * 使用观察者模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        //创建主题
        ConcreteStar star = new ConcreteStar();

        //创建观察者
        TailWanFan tailWanFan = new TailWanFan();
        ZheJiangFan zheJiangFan = new ZheJiangFan();

        //设置观察者需要观察的主题
        star.addFan(tailWanFan);
        //新增一个观察者
        star.addFan(zheJiangFan);
        //删除一个观察者
        star.removeFan(zheJiangFan);

        //明星发布一条动态
        star.publishing("王力宏离婚了，其具体原因是……此处省略5000字");
    }
}
