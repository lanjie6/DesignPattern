package com.java.behavioralType.mediator;

/**
 * 生活委员类（具体同事类）
 */
public class LifeLeader extends ClassLeader {

    public LifeLeader(Mediator media) {
        super.media = media;
        media.register("LifeLeader", this);
    }

    @Override
    public void job() {
        System.out.println("生活委员->小张最近生活作风有点问题，需要我的帮助!");
    }

    @Override
    public void sendRequest() {
        System.out.println("生活委员->小张是不是有什么精神负担，班长大人去叫心理委员去看看什么情况吧!");
        media.command("PsychologicalLeader");
    }
}

