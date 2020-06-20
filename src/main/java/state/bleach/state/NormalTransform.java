package state.bleach.state;

public class NormalTransform implements ITransformState{

    private TransformStateMachine transformStateMachine;

    public NormalTransform(TransformStateMachine transformStateMachine) {
        this.transformStateMachine = transformStateMachine;
    }

    /**
     * 获取当前状态
     * @return
     */
    public State getState() {
        return State.NORMAL;
    }

    /**
     * 吃下始解药丸
     */
    public void eateInitialPill() {
        System.out.println("吃下始解药丸");
        transformStateMachine.setCurrentState(new InitialTransform(transformStateMachine));
        transformStateMachine.setFightingPower(transformStateMachine.getFightingPower() + 200);
        System.out.println("**变身始解状态**战斗力加200");
    }

    /**
     * 吃下卍解药丸
     */
    public void eateSwastikaPill() {
        System.out.println("吃下卍解药丸");
        transformStateMachine.setCurrentState(new SwastikaTransform(transformStateMachine));
        transformStateMachine.setFightingPower(transformStateMachine.getFightingPower() + 500);
        System.out.println("**变身卍解状态**战斗力加500");
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
        System.out.println("木有任何变化。。。");
    }
}
