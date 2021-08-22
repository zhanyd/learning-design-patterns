package mediator.factory;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        // 项目管理部
        Mediator mediator = new ProjectManagementMediator();
        // 市场部
        MarketingDepartment marketingDepartment = new MarketingDepartment(mediator);
        // 通知生产
        marketingDepartment.notifyProduction();
        // 生产部
        ProductionDepartment productionDepartment = new ProductionDepartment(mediator);
        // 通知采购
        productionDepartment.notificationPurchase();
        // 采购部
        PurchasingDepartment purchasingDepartment = new PurchasingDepartment(mediator);
        // 通知入库
        purchasingDepartment.notificationStorage();
        // 仓库
        Warehouse warehouse = new Warehouse(mediator);
        // 通知提料
        warehouse.notificationExtractRowMaterials();
        // 生产部通知入库
        productionDepartment.notificationStorage();
    }
}
