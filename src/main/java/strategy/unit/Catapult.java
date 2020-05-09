package strategy.unit;

/**
 * 投石车
 * @author zhanyd
 */
public class Catapult extends Unit{
    public Catapult() {
        name = "投石车";
        // 用石头攻击
        fightBeHavior = new FightWithStone();
        // 不能回血，不用设置回血功能
    }
}
