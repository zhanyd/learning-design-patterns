package mediator.factory;

/**
 * 部门抽象类
 */
public abstract class Department {

    /**
     * 中介类
     */
    Mediator mediator;

    public Department(Mediator mediator) {
        this.mediator = mediator;
    }
}
