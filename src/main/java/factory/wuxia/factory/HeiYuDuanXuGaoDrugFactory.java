package factory.wuxia.factory;

public class HeiYuDuanXuGaoDrugFactory implements IDrugFactory{

    public Drug createDrug() {
        return new HeiYuDuanXuGaoDrug();
    }
}
