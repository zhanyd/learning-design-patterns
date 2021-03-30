package iterator.soldier.normal;

import java.util.HashSet;

/**
 * 简雍队
 */
public class JianYongSetArmy {

    HashSet<Soldier> soldierSet;

    public JianYongSetArmy() {
        soldierSet = new HashSet<Soldier>();
        addItem("焦上章","诸葛连弩","简雍队");
        addItem("慕容丁","诸葛连弩","简雍队");
        addItem("田重光","诸葛连弩","简雍队");
        addItem("万重光","诸葛连弩","简雍队");
        addItem("红昭阳","诸葛连弩","简雍队");
    }

    /**
     * 添加元素到集合
     * @param name
     * @param unit
     * @param belongs
     */
    public void addItem(String name, String unit, String belongs) {
        Soldier soldier = new Soldier(name, unit, belongs);
        soldierSet.add(soldier);
    }

    /**
     * 获取士兵集合
     * @return
     */
    public HashSet<Soldier> getSoldiers() {
        return soldierSet;
    }
}
