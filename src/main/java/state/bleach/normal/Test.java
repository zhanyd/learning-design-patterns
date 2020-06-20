package state.bleach.normal;

public class Test {

    public static void main(String[] args) {
        TransformStateMachine transformStateMachine = new TransformStateMachine();
        System.out.println("当前状态: " + transformStateMachine.getCurrentState() + "; 战斗力指数: " + transformStateMachine.getFightingPower() + '\n');
        transformStateMachine.eateInitialPill();
        System.out.println("当前状态: " + transformStateMachine.getCurrentState() + "; 战斗力指数: " + transformStateMachine.getFightingPower() + '\n');
        transformStateMachine.eateSwastikaPill();
        System.out.println("当前状态: " + transformStateMachine.getCurrentState() + "; 战斗力指数: " + transformStateMachine.getFightingPower() + '\n');
        transformStateMachine.eateBlurPill();
        System.out.println("当前状态: " + transformStateMachine.getCurrentState() + "; 战斗力指数: " + transformStateMachine.getFightingPower() + '\n');
        transformStateMachine.useUniqueSkill();
        System.out.println("当前状态: " + transformStateMachine.getCurrentState() + "; 战斗力指数: " + transformStateMachine.getFightingPower() + '\n');
        transformStateMachine.useUniqueSkill();
        System.out.println("当前状态: " + transformStateMachine.getCurrentState() + "; 战斗力指数: " + transformStateMachine.getFightingPower() + '\n');
    }
}
