package strategy.unit;

/**
 * 骑士
 * @author zhanyd
 */
public class Knight extends Unit{
    public Knight() {
        name = "骑士";
        // 用长枪攻击
        fightBeHavior = new FightWithSpear();
        // 回血速度快
        selfHealingBeHavior = new SelfHealingFast();
    }
}
