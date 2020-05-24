package factory.wuxia.factory;

public class XingJunDanDrugFactory implements IDrugFactory{

    public Drug createDrug() {
        return new XingJunDanDrug();
    }
}
