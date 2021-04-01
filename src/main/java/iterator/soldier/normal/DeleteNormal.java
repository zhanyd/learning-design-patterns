package iterator.soldier.normal;

import java.util.ArrayList;

public class DeleteNormal {
    public static void main(String[] args) {
        // 遍历马良队
        MaliangListArmy maliangListArmy = new MaliangListArmy();
        ArrayList<Soldier> soldierList = maliangListArmy.getSoldiers();
        for(int i = 0; i < soldierList.size(); i++) {
            soldierList.remove(i);
            System.out.println(soldierList.get(i));
        }

        for(Soldier soldier : soldierList) {
            //soldierList.remove(soldier);
            System.out.println(soldier);
        }
    }
}
