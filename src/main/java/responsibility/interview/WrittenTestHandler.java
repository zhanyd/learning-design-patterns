package responsibility.interview;

/**
 * 笔试
 */
public class WrittenTestHandler extends Handler{

    /**
     * 合格能力值
     */
    final static int PASS_ABILITY_VALUE = 80;

    /**
     * 处理的方法
     *
     * @param abilityValue 能力值
     */
    @Override
    public void handle(int abilityValue) {
        if(abilityValue > PASS_ABILITY_VALUE) {
            System.out.println("笔试通过。");
            if(nextHandler != null) {
                nextHandler.handle(abilityValue);
            } else {
                System.out.println("成功入职！");
            }
        } else {
            System.out.println("笔试失败。");
        }
    }
}
