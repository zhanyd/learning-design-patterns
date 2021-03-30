package iterator.soldier.normal;

import java.util.ArrayList;

/**
 * 马良队
 */
public class MaliangListArmy {

    ArrayList<Soldier> soldierList;

    public MaliangListArmy() {
        soldierList = new ArrayList<Soldier>();
        addItem("达海青","骑兵","马良队");
        addItem("严行秋","骑兵","马良队");
        addItem("卓重云","骑兵","马良队");
        addItem("王勇申","骑兵","马良队");
        addItem("邱协洽","骑兵","马良队");
    }

    /**
     * 添加元素到列表
     * @param name
     * @param unit
     * @param belongs
     */
    public void addItem(String name, String unit, String belongs) {
        Soldier soldier = new Soldier(name, unit, belongs);
        soldierList.add(soldier);
    }

    /**
     * 获取士兵列表
     * @return
     */
    public ArrayList<Soldier> getSoldiers() {
        return soldierList;
    }

}
