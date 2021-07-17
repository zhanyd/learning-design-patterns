package responsibility.interview;

/**
 * 事件处理类
 */
public abstract class Handler {

    /**
     * 下一个处理者
     */
    protected Handler nextHandler = null;

    /**
     * 设置一下个处理者
     * @param nextHandler
     * @return
     */
    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    /**
     * 处理的方法
     * @param abilityValue 面试者的能力值
     */
    public abstract void handle(int abilityValue);
}
