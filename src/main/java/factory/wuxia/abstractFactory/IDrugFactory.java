package factory.wuxia.abstractFactory;

public interface IDrugFactory {

    /**
     * 生产药品
     * @return
     */
    Drug createDrug(String type);
}
