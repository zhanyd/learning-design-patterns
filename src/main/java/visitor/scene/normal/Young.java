package visitor.scene.normal;

/**
 * 年轻人
 */
public class Young extends Person{

    public Young(String scene) {
        super(scene);
    }

    @Override
    public void answer() {
        if("工作不顺利".equals(scene)) {
            System.out.println("年轻人：此处不留爷，自有留爷处，立马换工作。");
        } else if("年终奖".equals(scene)) {
            System.out.println("年轻人：去买个最新款的手机或者其他电子产品，好好爽一爽，今朝有酒今朝醉。");
        } else if("周末".equals(scene)) {
            System.out.println("年轻人：两件事，睡觉，打游戏。");
        }
    }
}
