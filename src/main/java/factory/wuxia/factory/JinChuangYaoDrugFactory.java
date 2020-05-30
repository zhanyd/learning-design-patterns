package factory.wuxia.factory;

public class JinChuangYaoDrugFactory implements IDrugFactory {

    @Override
    public Drug createDrug() {
        return new JinChuangYaoDrug();
    }
}
