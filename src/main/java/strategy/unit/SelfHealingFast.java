package strategy.unit;

public class SelfHealingFast implements SelfHealingBeHavior{
    public void selfHealing() {
        System.out.println("我每秒回血3%\n");
    }
}
