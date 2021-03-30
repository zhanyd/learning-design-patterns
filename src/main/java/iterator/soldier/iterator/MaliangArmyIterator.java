package iterator.soldier.iterator;

import iterator.soldier.normal.Soldier;

import java.util.ArrayList;

/**
 * 马良队迭代器实现类
 */
public class MaliangArmyIterator implements Iterator {

    private int index = 0;
    private ArrayList<Soldier> soldierList;

    public MaliangArmyIterator(ArrayList<Soldier> soldierList) {
        this.soldierList = soldierList;
    }

    @Override
    public boolean hasNext() {
        if(index < soldierList.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Soldier next() {
        Soldier item = soldierList.get(index);
        index++;
        return item;
    }

}
