package factory.wuxia.factory;

public class JinChuangYaoDrugFactory implements IDrugFactory {

    public Drug createDrug() {
        return new JinChuangYaoDrug();
    }
}
