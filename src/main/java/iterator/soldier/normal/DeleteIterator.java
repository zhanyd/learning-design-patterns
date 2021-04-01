package iterator.soldier.normal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeleteIterator {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<String>();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        lists.add("d");
        lists.add("e");
        Iterator listsIterator = lists.iterator();
        while (listsIterator.hasNext()) {
            listsIterator.remove();
            System.out.println(listsIterator.next());
        }
    }
}
