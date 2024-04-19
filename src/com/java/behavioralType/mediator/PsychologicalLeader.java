package com.java.behavioralType.mediator;

/**
 * 心理委员
 */
public class PsychologicalLeader extends ClassLeader {

    public PsychologicalLeader(Mediator media) {
        super.media = media;
        media.register("PsychologicalLeader", this);
    }

    @Override
    public void job() {
        System.out.println("心理委员->小张最近心情好像不太好，需要我的帮助!");
    }

    @Override
    public void sendRequest() {
        System.out.println("心理委员->小张是不是生活上有什么问题，班长大人叫生活委员多关注一下吧!");
        media.command("LifeLeader");
    }
}
