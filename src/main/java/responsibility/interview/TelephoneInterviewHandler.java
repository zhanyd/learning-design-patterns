package responsibility.interview;

/**
 * 电话面试
 */
public class TelephoneInterviewHandler extends Handler{

    /**
     * 合格能力值
     */
    final static int PASS_ABILITY_VALUE = 60;

    /**
     * 处理的方法
     */
    @Override
    public void handle(int abilityValue) {
        if(abilityValue > PASS_ABILITY_VALUE) {
            System.out.println("电话面试通过。");
            if(nextHandler != null) {
                nextHandler.handle(abilityValue);
            } else {
                System.out.println("成功入职！");
            }
        } else {
            System.out.println("电话面试失败。");
        }
    }
}
