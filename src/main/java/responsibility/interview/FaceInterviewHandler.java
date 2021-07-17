package responsibility.interview;

/**
 * 当面面试
 */
public class FaceInterviewHandler extends Handler{

    /**
     * 合格能力值
     */
    final static int PASS_ABILITY_VALUE = 70;

    /**
     * 处理的方法
     *
     * @param abilityValue 能力值
     */
    @Override
    public void handle(int abilityValue) {
        if(abilityValue > PASS_ABILITY_VALUE) {
            System.out.println("当面面试通过。");
            if(nextHandler != null) {
                nextHandler.handle(abilityValue);
            } else {
                System.out.println("成功入职！");
            }
        } else {
            System.out.println("当面面试失败。");
        }
    }
}
