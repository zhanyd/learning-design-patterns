package visitor.scene.normal;

/**
 * 中年人
 */
public class MiddleAged extends Person{

    public MiddleAged(String scene) {
        super(scene);
    }

    @Override
    public void answer() {
        if("工作不顺利".equals(scene)) {
            System.out.println("中年人：先忍忍，再熬熬，说不定有时来运转的一天，毕竟每个月还有这么多房贷要还呢。");
        } else if("年终奖".equals(scene)) {
            System.out.println("中年人：全部拿去还房贷。");
        } else if("周末".equals(scene)) {
            System.out.println("中年人：两件事，干家务，带娃。");
        }
    }
}
