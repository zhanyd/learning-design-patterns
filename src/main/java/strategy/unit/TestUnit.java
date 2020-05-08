package strategy.unit;

public class TestUnit {
    public static void main(String[] args) {
        // 步兵出击
        Unit unit = new Infantry();
        unit.move();
        unit.fight();
        unit.stop();
        unit.selfHealing();

        // 弓箭手出击
        unit = new Archer();
        unit.move();
        unit.fight();
        unit.stop();
        unit.selfHealing();

        // 骑士出击
        unit = new Knight();
        unit.move();
        unit.fight();
        // 骑士扔掉了长枪，拔出了宝剑
        System.out.println("动态设置：骑士扔掉了长枪，拔出了宝剑！");
        unit.setFightBeHavior(new FightWithSword());
        unit.fight();
        unit.stop();
        unit.selfHealing();

        // 投石车出击
        unit = new Catapult();
        unit.move();
        unit.fight();
        unit.stop();
        // 修理工给投石车做了保养，投石车也能回血了
        System.out.println("动态设置：修理工给投石车做了保养，投石车也能回血了");
        unit.setSelfHealingBeHavior(new SelfHealingSlow());
        unit.selfHealing();
    }
}
