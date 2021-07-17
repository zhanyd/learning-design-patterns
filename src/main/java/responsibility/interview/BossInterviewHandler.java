package responsibility.interview;

/**
 * 老板面试
 */
public class BossInterviewHandler extends Handler{

    /**
     * 合格能力值
     */
    final static int PASS_ABILITY_VALUE = 90;

    /**
     * 处理的方法
     *
     * @param abilityValue 能力值
     */
    @Override
    public void handle(int abilityValue) {
        if(abilityValue > PASS_ABILITY_VALUE) {
            System.out.println("老板面试通过。");
            System.out.println("成功入职！");
        } else {
            System.out.println("老板面试失败。");
        }
    }
}
