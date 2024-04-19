package com.java.behavioralType.memento;

/**
 * 使用备忘录模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("游戏开始");
        game.play();

        System.out.println("捡到滑板，前进10步");
        game.setPlayerStep(10);

        System.out.println("存个档，创建存档");
        GameMemento gameMemento = game.createGameMemento();

        System.out.println("把存档交给存档器管理");
        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(gameMemento);
        System.out.println("存档完毕");

        System.out.println("继续前进1步");
        game.setPlayerStep(game.getPlayerStep() + 1);
        System.out.println("踩到屎了，当前步数为：" + game.getPlayerStep());

        System.out.println("读档，还原到之前一步");
        game.restore(caretaker.retrieveMemento());
        System.out.println("读档完毕，当前玩家步数是：" + game.getPlayerStep());
    }
}
