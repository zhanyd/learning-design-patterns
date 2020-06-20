package state.bleach.state;

public class SwastikaTransform implements ITransformState {

    private TransformStateMachine transformStateMachine;

    public SwastikaTransform(TransformStateMachine transformStateMachine) {
        this.transformStateMachine = transformStateMachine;
    }

    /**
     * 获取当前状态
     * @return
     */
    public State getState() {
        return State.SWASTIKA;
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
        System.out.println("吃下始解药丸");
        System.out.println("木有任何变化。。。");
    }

    /**
     * 吃下虚化药丸
     */
    public void eateBlurPill() {
        System.out.println("吃下虚化药丸");
        transformStateMachine.setCurrentState(new BlurTransform(transformStateMachine));
        transformStateMachine.setFightingPower(transformStateMachine.getFightingPower() + 1000);
        System.out.println("**变身虚化状态**战斗力加1000");
    }

    /**
     * 使用必杀技
     */
    public void useUniqueSkill() {
        System.out.println("使用必杀技");
        System.out.println("黑流牙突--->");
        transformStateMachine.setCurrentState(new NormalTransform(transformStateMachine));
        transformStateMachine.setFightingPower(100);
        System.out.println("**变回初始状态**战斗力变成100");
    }
}
