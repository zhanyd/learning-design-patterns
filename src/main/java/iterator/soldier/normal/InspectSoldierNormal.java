package iterator.soldier.normal;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 遍历士兵
 */
public class InspectSoldierNormal {
    public static void main(String[] args) {
        // 遍历周仓队
        ZhouCangArrayArmy zhouCangArrayArmy = new ZhouCangArrayArmy();
        Soldier[] soldierArray = zhouCangArrayArmy.getSoldiers();
        for(int i = 0; i < soldierArray.length; i++) {
            System.out.println(soldierArray[i]);
        }
        // 遍历马良队
        MaliangListArmy maliangListArmy = new MaliangListArmy();
        ArrayList<Soldier> soldierList = maliangListArmy.getSoldiers();
        for(int i = 0; i < soldierList.size(); i++) {
            System.out.println(soldierList.get(i));
        }
    }
}
