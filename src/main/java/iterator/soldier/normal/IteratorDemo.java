package iterator.soldier.normal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<String>();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        lists.add("d");
        lists.add("e");
        Iterator listsIterator = lists.iterator();
        Iterator listsIterator2 = lists.iterator();
        listsIterator.next();
        // 删除一个元素
        listsIterator.remove();
        // 集合变更后，抛出ConcurrentModificationException异常
        listsIterator2.next();
    }
}
