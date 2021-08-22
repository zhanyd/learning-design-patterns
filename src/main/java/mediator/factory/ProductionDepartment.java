package mediator.factory;

/**
 * 生产部门
 */
public class ProductionDepartment extends Department{

    public ProductionDepartment(Mediator mediator) {
        super(mediator);
    }

    /**
     * 生产产品
     */
    public void production() {
        System.out.println("生产产品");
    }

    /**
     * 通知采购
     */
    public void notificationPurchase() {
        super.mediator.notify(this, "通知采购");
    }

    /**
     * 通知入库
     */
    public void notificationStorage() {
        super.mediator.notify(this, "通知入库");
    }

}
