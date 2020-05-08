package strategy.unit;

/**
 * 兵种父类
 * @author zhanyd
 */
public class Unit {

    protected String name;

    protected FightBeHavior fightBeHavior;

    protected SelfHealingBeHavior selfHealingBeHavior;

    public void move() {
        System.out.println("我是：" + name);
        System.out.println("向前挺进...");
    }

    public void stop() {
        System.out.println("原地待命...");
    }

    /**
     * 动态设置战斗方式
     * @param fi
     */
    public void setFightBeHavior(FightBeHavior fi) {
        fightBeHavior = fi;
    }

    /**
     * 动态设置自愈速度
     * @param se
     */
    public void setSelfHealingBeHavior(SelfHealingBeHavior se) {
        selfHealingBeHavior = se;
    }

    /**
     * 战斗
     */
    public void fight() {
        fightBeHavior.fight();
    }

    /**
     * 自愈
     */
    public void selfHealing() {
        selfHealingBeHavior.selfHealing();
    }
}
