package strategy.unit;

/**
 * 投石车
 * @author zhanyd
 */
public class Catapult extends Unit{
    public Catapult() {
        name = "投石车";
        fightBeHavior = new FightWithStone();
    }
}
