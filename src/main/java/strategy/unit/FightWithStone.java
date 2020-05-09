package strategy.unit;

/**
 * 石头战斗子类
 * @author zhanyd
 */
public class FightWithStone implements FightBeHavior{
    public void fight() {
        System.out.println("攻击：我扔石头");
    }
}
