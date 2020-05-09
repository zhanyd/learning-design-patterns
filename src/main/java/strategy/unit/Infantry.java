package strategy.unit;

/**
 * 步兵
 * @author Administrator
 */
public class Infantry extends Unit{
    public Infantry() {
        name = "步兵";
        // 用剑攻击
        fightBeHavior = new FightWithSword();
        // 回血速度慢
        selfHealingBeHavior = new SelfHealingSlow();
    }
}
