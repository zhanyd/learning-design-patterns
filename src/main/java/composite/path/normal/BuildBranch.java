package composite.path.normal;

import java.util.List;

public class BuildBranch {

    public static void main(String[] args) {
        IBranch root = new Branch("根目录");

        IBranch firstLevelBranch1 = new Branch("1级目录1");
        ILeaf firstLevelBranch1File1 = new Leaf("1级目录1-文件1");
        ILeaf firstLevelBranch1File2 = new Leaf("1级目录1-文件2");
        firstLevelBranch1.add(firstLevelBranch1File1);
        firstLevelBranch1.add(firstLevelBranch1File2);
        // 把1级目录1添加到根目录
        root.add(firstLevelBranch1);

        IBranch firstLevelBranch2 = new Branch("1级目录2");
        ILeaf firstLevelBranch2File1 = new Leaf("1级目录2-文件1");
        firstLevelBranch2.add(firstLevelBranch2File1);
        // 把1级目录2添加到根目录
        root.add(firstLevelBranch2);

        IBranch secondLevelBranch1 = new Branch("2级目录1");
        ILeaf secondLevelBranch1File1 = new Leaf("2级目录1-文件1");
        ILeaf secondLevelBranch1File2 = new Leaf("2级目录1-文件2");
        secondLevelBranch1.add(secondLevelBranch1File1);
        secondLevelBranch1.add(secondLevelBranch1File2);
        // 把2级目录添加到1级目录
        firstLevelBranch1.add(secondLevelBranch1);

        root.print(0);
        // 遍历所有文件和文件夹
        printAll(root.getSubList(), 1);

    }

    /**
     * 遍历所有文件和文件夹
     * @param list
     * @param depth
     */
    public static void printAll(List<Object> list, int depth) {
        for(Object object : list) {
            if(object instanceof Leaf) {
                ((Leaf) object).print(depth);
            } else {
                ((Branch) object).print(depth);
                printAll(((Branch) object).getSubList(), depth + 2);
            }
        }
    }
}
