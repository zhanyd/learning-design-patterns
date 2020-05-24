package factory.wuxia.factory;

public class LinHuXianDanDrugFactory implements IDrugFactory{

    public Drug createDrug() {
        return new LinHuXianDanDrug();
    }
}
