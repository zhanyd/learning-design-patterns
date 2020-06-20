package state.bleach.normal;

public class TransformStateMachine {

    /**
     * 战斗力
     */
    private int fightingPower;
    /**
     * 当前状态
     */
    private State currentState;


    public int getFightingPower() {
        return this.fightingPower;
    }

    public State getCurrentState() {
        return this.currentState;
    }

    /**
     * 初始化
     */
    public TransformStateMachine() {
        this.fightingPower = 100;
        this.currentState = State.NORMAL;
    }

    /**
     * 吃下始解药丸
     */
    public void eateInitialPill() {
        System.out.println("吃下始解药丸");
        if(currentState.equals(State.NORMAL)) {
            this.currentState = State.INITIAL;
            this.fightingPower += 200;
            System.out.println("**变身始解状态**战斗力加200");
        } else {
            System.out.println("木有任何变化。。。");
        }
    }

    /**
     * 吃下卍解药丸
     */
    public void eateSwastikaPill() {
        System.out.println("吃下卍解药丸");
        if(currentState.equals(State.NORMAL) || currentState.equals(State.INITIAL)) {
            this.currentState = State.SWASTIKA;
            this.fightingPower += 500;
            System.out.println("**变身卍解状态**战斗力加500");
        } else {
            System.out.println("木有任何变化。。。");
        }
    }

    /**
     * 吃下虚化药丸
     */
    public void eateBlurPill() {
        System.out.println("吃下虚化药丸");
        if(currentState.equals(State.SWASTIKA)) {
            this.currentState = State.BLUR;
            this.fightingPower += 1000;
            System.out.println("**变身虚化状态**战斗力加1000");
        } else {
            System.out.println("木有任何变化。。。");
        }
    }

    /**
     * 使用必杀技
     */
    public void useUniqueSkill() {
        System.out.println("使用必杀技");
        if(currentState.equals(State.INITIAL) || currentState.equals(State.SWASTIKA) || currentState.equals(State.BLUR)) {
            System.out.println("月牙天冲--->");
            this.currentState = State.NORMAL;
            this.fightingPower = 100;
            System.out.println("**变回初始状态**战斗力变成100");
        } else {
            System.out.println("木有任何变化。。。");
        }
    }
}
