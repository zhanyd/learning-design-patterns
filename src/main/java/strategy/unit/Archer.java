package strategy.unit;

/**
 * 弓箭手
 * @author zhanyd
 */
public class Archer extends Unit{
    public Archer() {
        name = "弓箭手";
        // 用弓箭攻击
        fightBeHavior = new FightWithArrow();
        // 回血速度一般
        selfHealingBeHavior = new SelfHealingNormal();
    }
}
