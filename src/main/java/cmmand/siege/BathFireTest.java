package cmmand.siege;

/**
 * 批量攻击测试类
 * @author zhanyd
 * @date 2020-12-26
 */
public class BathFireTest {
    public static void main(String[] args) {
        BatchFireCommand batchFireCommand = new BatchFireCommand();
        // 魔法师攻击
        Magician magician = new Magician();
        MagicianFireCommand magicianFireCommand = new MagicianFireCommand(magician);
        batchFireCommand.addCommand(magicianFireCommand);
        // 投石车攻击
        Catapult catapult = new Catapult();
        CatapultFireCommand catapultFireCommand = new CatapultFireCommand(catapult);
        batchFireCommand.addCommand(catapultFireCommand);
        // 冲车攻击
        RushCar rushCar = new RushCar();
        RushCarFireCommand rushCarFireCommand = new RushCarFireCommand(rushCar);
        batchFireCommand.addCommand(rushCarFireCommand);
        // 一起上
        batchFireCommand.fire();
    }
}
