package state.bleach.state;

public class BlurTransform implements ITransformState {

    private TransformStateMachine transformStateMachine;

    public BlurTransform(TransformStateMachine transformStateMachine) {
        this.transformStateMachine = transformStateMachine;
    }

    /**
     * 获取当前状态
     * @return
     */
    public State getState() {
        return State.BLUR;
    }

    /**
     * 吃下始解药丸
     */
    public void eateInitialPill() {
        System.out.println("吃下始解药丸");
        System.out.println("木有任何变化。。。");
    }

    /**
     * 吃下卍解药丸
     */
    public void eateSwastikaPill() {
        System.out.println("吃下卍解药丸");
        System.out.println("木有任何变化。。。");
    }

    /**
     * 吃下虚化药丸
     */
    public void eateBlurPill() {
        System.out.println("吃下虚化药丸");
        System.out.println("木有任何变化。。。");
    }

    /**
     * 使用必杀技
     */
    public void useUniqueSkill() {
        System.out.println("使用必杀技");
        System.out.println("王虚的闪光--->");
        transformStateMachine.setCurrentState(new NormalTransform(transformStateMachine));
        transformStateMachine.setFightingPower(100);
        System.out.println("**变回初始状态**战斗力变成100");
    }
}
