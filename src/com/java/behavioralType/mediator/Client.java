package com.java.behavioralType.mediator;

/**
 * 使用中介者模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        Mediator m = new ClassMonitor();
        ClassLeader life = new LifeLeader(m);
        ClassLeader study = new StudyLeader(m);
        ClassLeader psycho = new PsychologicalLeader(m);
        //当前委员发送请求给班长然后通过班长与其他委员通信
        System.out.println("------生活委员->班长->心理委员------");
        life.sendRequest();
        System.out.println("--------------------------");

        System.out.println("------学习委员->班长->心理委员,生活委员------");
        study.sendRequest();
        System.out.println("--------------------------");

        System.out.println("------心理委员->班长->生活委员------");
        psycho.sendRequest();
    }
}
