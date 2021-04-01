package iterator.soldier.utilIterator;

import iterator.soldier.normal.Soldier;

import java.util.Iterator;

/**
 * 周仓队迭代器实现类
 */
public class ZhouCangArmyIterator implements Iterator {

    private int index = 0;
    private Soldier[] soldierArray;

    public ZhouCangArmyIterator(Soldier[] soldierArray) {
        this.soldierArray = soldierArray;
    }

    @Override
    public boolean hasNext() {
        if(index < soldierArray.length) {
            return true;
        }
        return false;
    }

    @Override
    public Soldier next() {
        Soldier soldier = soldierArray[index];
        index++;
        return soldier;
    }
}
