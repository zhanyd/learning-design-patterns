package memento.game.normal;

/**
 * 客户端类
 */
public class Client {

    public static void main(String[] args) {
        Hero hero = new Hero(90,85,70);
        // 挑战boss之前的状态
        System.out.println("挑战boss之前的状态：\n" + hero);
        // 保存进度
        Hero heroBackUp = new Hero(hero.getHealthPoint(), hero.getMagicalValue(), hero.getAttackPower());
        // 挑战失败
        hero.gameOver();
        System.out.println("挑战失败后的状态：\n" + hero);
        // 恢复进度
        hero.setState(heroBackUp.getHealthPoint(), heroBackUp.getMagicalValue(), heroBackUp.getAttackPower());
        System.out.println("恢复进度后的状态：\n" + hero);
    }
}
