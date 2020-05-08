package strategy.unit;

/**
 * 骑士
 * @author zhanyd
 */
public class Knight extends Unit{
    public Knight() {
        name = "骑士";
        fightBeHavior = new FightWithSpear();
        selfHealingBeHavior = new SelfHealingFast();
    }
}
