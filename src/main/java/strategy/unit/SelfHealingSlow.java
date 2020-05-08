package strategy.unit;

public class SelfHealingSlow implements SelfHealingBeHavior{
    public void selfHealing() {
        System.out.println("我每秒回血1%\n");
    }
}
