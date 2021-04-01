package iterator.soldier.utilIterator;

import java.util.Iterator;

/**
 * 遍历士兵
 */
public class InspectSoldierIterator {

    public static void main(String[] args) {
        // 遍历周仓队
        ZhouCangArrayArmy zhouCangArrayArmy = new ZhouCangArrayArmy();
        Iterator iterator = zhouCangArrayArmy.createIterator();
        // 调用统一的遍历方法
        traversalItems(iterator);

        // 遍历马良队
        MaliangListArmy maliangListArmy = new MaliangListArmy();
        iterator = maliangListArmy.getSoldiers().iterator();
        // 调用统一的遍历方法
        traversalItems(iterator);
    }

    /**
     * 遍历元素
     * @param iterator
     */
    public static void traversalItems(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
