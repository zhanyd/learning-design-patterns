package mediator.factory;

/**
 * 项目管理部
 */
public class ProjectManagementMediator implements Mediator{

    private MarketingDepartment marketingDepartment;
    private ProductionDepartment productionDepartment;
    private PurchasingDepartment purchasingDepartment;
    private Warehouse warehouse;

    public ProjectManagementMediator() {
        this.marketingDepartment = new MarketingDepartment(this);
        this.productionDepartment = new ProductionDepartment(this);
        this.purchasingDepartment = new PurchasingDepartment(this);
        this.warehouse = new Warehouse(this);
    }

    @Override
    public void notify(Department department, String event) {
        // 市场部的通知
        if(department instanceof MarketingDepartment) {
            this.productionDepartment.production();
        }
        // 生产部的通知
        else if(department instanceof ProductionDepartment) {
            if("通知采购".equals(event)) {
                this.purchasingDepartment.PurchaseRawMaterials();
            } else if("通知入库".equals(event)) {
                this.warehouse.finishedProductStorage();
            }
        }
        // 采购部的通知
        else if(department instanceof PurchasingDepartment) {
            if("通知入库".equals(event)) {
                this.warehouse.rawMaterialStorage();
            }
        }
        // 仓库的通知
        else if(department instanceof Warehouse) {
            if("通知提料".equals(event)) {
                this.productionDepartment.production();
            }
        }
    }
}
