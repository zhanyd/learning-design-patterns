package state.bleach.normal;


public enum State {

    /**
     * 正常状态
     */
    NORMAL(0),
    /**
     * 始解状态
     */
    INITIAL(1),
    /**
     * 卍解状态
     */
    SWASTIKA(2),
    /**
     * 虚化状态
     */
    BLUR(3);

    private int value;

    private State(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
