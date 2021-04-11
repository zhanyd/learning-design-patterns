package composite.path.normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Branch implements IBranch{

    List<Object> branchList = new ArrayList<Object>();

    String name;
    public Branch(String name) {
        this.name = name;
    }

    @Override
    public void print(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth, "--")) + name);
    }

    @Override
    public void add(IBranch branch) {
        branchList.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        branchList.add(leaf);
    }

    @Override
    public List getSubList() {
        return branchList;
    }
}
