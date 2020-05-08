package strategy.unit;

/**
 * 弓箭手
 * @author zhanyd
 */
public class Archer extends Unit{
    public Archer() {
        name = "弓箭手";
        fightBeHavior = new FightWithArrow();
        selfHealingBeHavior = new SelfHealingNormal();
    }
}
