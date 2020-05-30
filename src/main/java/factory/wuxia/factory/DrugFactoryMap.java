package factory.wuxia.factory;

import java.util.HashMap;
import java.util.Map;

public class DrugFactoryMap {

    private static final Map<String, IDrugFactory> cachedFactories = new HashMap<String, IDrugFactory>();

    static {
        cachedFactories.put("行军丹", new XingJunDanDrugFactory());
        cachedFactories.put("金疮药", new JinChuangYaoDrugFactory());
        cachedFactories.put("黑玉断续膏", new HeiYuDuanXuGaoDrugFactory());
        cachedFactories.put("灵葫仙丹", new LinHuXianDanDrugFactory());
    }

    public static IDrugFactory getFactory(String type) {
        if(type == null || type.isEmpty()) {
            return null;
        }
        return cachedFactories.get(type);
    }
}
