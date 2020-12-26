package cmmand.siege;

/**
 * 攻击测试类
 * @author zhanyd
 * @date 2020-12-26
 */
public class FireTest {
    public static void main(String[] args) {
        FireCommand fireCommand = new FireCommand();
        // 投石车攻击
        Catapult catapult = new Catapult();
        CatapultFireCommand catapultFireCommand = new CatapultFireCommand(catapult);
        fireCommand.setCommand(catapultFireCommand);
        fireCommand.fire();
        // 冲车攻击
        RushCar rushCar = new RushCar();
        RushCarFireCommand rushCarFireCommand = new RushCarFireCommand(rushCar);
        fireCommand.setCommand(rushCarFireCommand);
        fireCommand.fire();
        // 魔法师攻击
        Magician magician = new Magician();
        MagicianFireCommand magicianFireCommand = new MagicianFireCommand(magician);
        fireCommand.setCommand(magicianFireCommand);
        fireCommand.fire();
    }
}
