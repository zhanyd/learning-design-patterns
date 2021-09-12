package visitor.scene.visitor;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new Young("小帅"));
        objectStructure.add(new MiddleAged("老王"));

        // 工作不顺利的场景
        WorkNotWell workNotWell = new WorkNotWell();
        objectStructure.display(workNotWell);

        // 年终奖的场景
        YearEndAwards yearEndAwards = new YearEndAwards();
        objectStructure.display(yearEndAwards);

        // 周末的场景
        Weekend weekend = new Weekend();
        objectStructure.display(weekend);

        // 睡觉的场景
        Sleep sleep = new Sleep();
        objectStructure.display(sleep);
    }
}
