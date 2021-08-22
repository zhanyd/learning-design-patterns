package mediator.factory;

/**
 * 采购部门
 */
public class PurchasingDepartment extends Department{

    public PurchasingDepartment(Mediator mediator) {
        super(mediator);
    }

    /**
     * 采购原材料
     */
    public void PurchaseRawMaterials() {
        System.out.println("采购原材料");
    }

    /**
     * 通知入库
     */
    public void notificationStorage() {
        super.mediator.notify(this, "通知入库");
    }
}
