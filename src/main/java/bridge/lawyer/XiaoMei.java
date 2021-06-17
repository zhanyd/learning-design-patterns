package bridge.lawyer;

/**
 * 小美
 */
public class XiaoMei extends Citizen{

    public XiaoMei(Lawyer lawyer) {
        super(lawyer);
    }

    /**
     * 出庭
     */
    @Override
    public void appearInCourt() {
        System.out.println("小美出庭：");
        super.lawyer.debate();
    }
}
