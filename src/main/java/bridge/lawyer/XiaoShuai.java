package bridge.lawyer;

/**
 * 小帅
 */
public class XiaoShuai extends Citizen{

    public XiaoShuai(Lawyer lawyer) {
        super(lawyer);
    }

    /**
     * 出庭
     */
    @Override
    public void appearInCourt() {
        System.out.println("小帅出庭：");
        super.lawyer.debate();
    }
}
