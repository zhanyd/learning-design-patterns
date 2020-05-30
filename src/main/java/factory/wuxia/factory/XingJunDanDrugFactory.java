package factory.wuxia.factory;

public class XingJunDanDrugFactory implements IDrugFactory{

    @Override
    public Drug createDrug() {
        return new XingJunDanDrug();
    }
}
