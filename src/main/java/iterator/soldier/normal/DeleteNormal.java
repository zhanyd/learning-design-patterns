package iterator.soldier.normal;

import java.util.ArrayList;
import java.util.List;

public class DeleteNormal {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<String>();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        lists.add("d");
        lists.add("e");
        for(int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
            lists.remove(i);
        }
    }
}
