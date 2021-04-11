package composite.path.normal;

import java.util.Collections;

/**
 * 文件实现类
 */
public class Leaf implements ILeaf{

    String name;
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void print(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth, "--")) + name);
    }
}
