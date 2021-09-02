package memento.game.memento;

/**
 * 客户端类
 */
public class Client {
    public static void main(String[] args) {
        Hero hero = new Hero(90,85,70);
        // 挑战boss之前的状态
        System.out.println("挑战boss之前的状态：\n" + hero);
        // 保存进度
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(hero.createMemento());
        // 挑战失败
        hero.gameOver();
        System.out.println("挑战失败后的状态：\n" + hero);
        // 恢复进度
        hero.restoreMemento(caretaker.getMemento());
        System.out.println("恢复进度后的状态：\n" + hero);
    }
}
