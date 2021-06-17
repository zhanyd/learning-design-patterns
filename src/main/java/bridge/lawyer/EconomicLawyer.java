package bridge.lawyer;

/**
 * 经济律师
 */
public class EconomicLawyer implements Lawyer{

    /**
     * 辩论
     */
    @Override
    public void debate() {
        System.out.println("经济律师在法庭上进行经济案件辩论。");
    }
}
