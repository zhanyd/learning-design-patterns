package iterator.soldier.normal;

import java.util.ArrayList;

/**
 * 周仓队
 */
public class ZhouCangArrayArmy {

    static final int MAX_ITEMS_NUM = 5;
    Soldier[] soldierArray;
    int index = 0;

    public ZhouCangArrayArmy() {
        soldierArray = new Soldier[MAX_ITEMS_NUM];
        addItem("华季鸣","步兵","周仓队");
        addItem("春孟心","步兵","周仓队");
        addItem("务孟晓","步兵","周仓队");
        addItem("成仲爰","步兵","周仓队");
        addItem("汉孟宝","步兵","周仓队");
    }

    /**
     * 添加元素到数组
     * @param name
     * @param unit
     * @param belongs
     */
    public void addItem(String name, String unit, String belongs) {
        Soldier soldier = new Soldier(name, unit, belongs);
        if(index >= MAX_ITEMS_NUM) {
            System.out.println("数组已满，无法添加。");
        } else {
            soldierArray[index] = soldier;
            index++;
        }
    }

    /**
     * 获取士兵数组
     * @return
     */
    public Soldier[] getSoldiers() {
        return soldierArray;
    }

}
