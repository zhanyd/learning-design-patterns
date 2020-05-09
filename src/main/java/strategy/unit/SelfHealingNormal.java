package strategy.unit;
/**
 * 中速回血子类
 * @author zhanyd
 */
public class SelfHealingNormal implements SelfHealingBeHavior{
    public void selfHealing() {
        System.out.println("我每秒回血2%\n");
    }
}
