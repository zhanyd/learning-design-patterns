package factory.wuxia.factory;

public class HeiYuDuanXuGaoDrugFactory implements IDrugFactory{

    @Override
    public Drug createDrug() {
        return new HeiYuDuanXuGaoDrug();
    }
}
