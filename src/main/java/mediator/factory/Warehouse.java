package mediator.factory;

/**
 * 仓库
 */
public class Warehouse extends Department{

    public Warehouse(Mediator mediator) {
        super(mediator);
    }

    /**
     * 原材料入库
     */
    public void rawMaterialStorage() {
        System.out.println("原材料入库");
    }

    /**
     * 产成品入库
     */
    public void finishedProductStorage() {
        System.out.println("产成品入库");
    }

    /**
     * 通知提料
     */
    public void notificationExtractRowMaterials() {
        super.mediator.notify(this, "通知提料");
    }
}
