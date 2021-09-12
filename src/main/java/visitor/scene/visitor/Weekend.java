package visitor.scene.visitor;

/**
 * 周末
 */
public class Weekend implements Scene{

    @Override
    public void getYoungAnswer(Young young) {
        System.out.println(young.name + "：两件事，睡觉，打游戏。");
    }

    @Override
    public void getMiddleAgedAnswer(MiddleAged middleAged) {
        System.out.println(middleAged.name + "：两件事，干家务，带娃。");
    }
}
