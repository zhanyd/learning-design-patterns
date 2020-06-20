package state.bleach.state;

public class TransformStateMachine {

    /**
     * 战斗力
     */
    private int fightingPower;
    /**
     * 当前状态
     */
    private ITransformState currentState;

    /**
     * 初始化
     */
    public TransformStateMachine() {
        this.fightingPower = 100;
        this.currentState = new NormalTransform(this);
    }

    /**
     * 吃下始解药丸
     */
    public void eateInitialPill() {
        this.currentState.eateInitialPill();
    }

    /**
     * 吃下卍解药丸
     */
    public void eateSwastikaPill() {
        this.currentState.eateSwastikaPill();
    }

    /**
     * 吃下虚化药丸
     */
    public void eateBlurPill() {
        this.currentState.eateBlurPill();
    }

    /**
     * 使用必杀技
     */
    public void useUniqueSkill() {
        this.currentState.useUniqueSkill();
    }

    public int getFightingPower() {
        return this.fightingPower;
    }

    public void setFightingPower(int fightingPower) {
        this.fightingPower = fightingPower;
    }

    public State getCurrentState() {
        return this.currentState.getState();
    }

    public void setCurrentState(ITransformState currentState) {
        this.currentState = currentState;
    }
}
