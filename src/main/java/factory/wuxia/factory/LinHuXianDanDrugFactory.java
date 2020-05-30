package factory.wuxia.factory;

public class LinHuXianDanDrugFactory implements IDrugFactory{

    @Override
    public Drug createDrug() {
        return new LinHuXianDanDrug();
    }
}
