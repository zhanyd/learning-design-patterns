package visitor.scene.visitor;

/**
 * 工作不顺
 */
public class WorkNotWell implements Scene{

    @Override
    public void getYoungAnswer(Young young) {
        System.out.println(young.name + "：此处不留爷，自有留爷处，立马换工作。");
    }

    @Override
    public void getMiddleAgedAnswer(MiddleAged middleAged) {
        System.out.println(middleAged.name + "：先忍忍，再熬熬，说不定有时来运转的一天，毕竟每个月还有这么多房贷要还呢。");
    }
}
