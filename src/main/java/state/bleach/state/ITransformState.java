package state.bleach.state;

public interface ITransformState {

    /**
     * 获取当前状态
     * @return
     */
    State getState();

    /**
     * 吃下始解药丸
     */
    void eateInitialPill();

    /**
     * 吃下卍解药丸
     */
    void eateSwastikaPill();

    /**
     * 吃下虚化药丸
     */
    void eateBlurPill();

    /**
     * 使用必杀技
     */
    void useUniqueSkill();
}
