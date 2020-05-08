package strategy.unit;

/**
 * 步兵
 * @author Administrator
 */
public class Infantry extends Unit{
    public Infantry() {
        name = "步兵";
        fightBeHavior = new FightWithSword();
        selfHealingBeHavior = new SelfHealingSlow();
    }
}
