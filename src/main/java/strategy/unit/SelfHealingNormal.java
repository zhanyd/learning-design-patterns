package strategy.unit;

public class SelfHealingNormal implements SelfHealingBeHavior{
    public void selfHealing() {
        System.out.println("我每秒回血2%\n");
    }
}
