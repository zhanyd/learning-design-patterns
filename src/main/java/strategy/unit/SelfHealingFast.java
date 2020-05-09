package strategy.unit;
/**
 * 快速回血子类
 * @author zhanyd
 */
public class SelfHealingFast implements SelfHealingBeHavior{
    public void selfHealing() {
        System.out.println("我每秒回血3%\n");
    }
}
