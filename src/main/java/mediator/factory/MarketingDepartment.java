package mediator.factory;

/**
 * 市场部门
 */
public class MarketingDepartment extends Department{

    public MarketingDepartment(Mediator mediator) {
        super(mediator);
    }

    /**
     * 通知生产
     */
    public void notifyProduction() {
        super.mediator.notify(this, "开始生产");
    }
}
