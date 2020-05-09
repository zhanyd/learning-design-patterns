package strategy.unit;
/**
 * 慢速回血子类
 * @author zhanyd
 */
public class SelfHealingSlow implements SelfHealingBeHavior{
    public void selfHealing() {
        System.out.println("我每秒回血1%\n");
    }
}
