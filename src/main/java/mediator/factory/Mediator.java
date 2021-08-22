package mediator.factory;

/**
 * 中介者接口
 */
public interface Mediator {
    /**
     * 通知方法
     * @param department
     * @param event
     */
    void notify(Department department, String event);
}
