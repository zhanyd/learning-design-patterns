package visitor.scene.visitor;

/**
 * 睡觉
 */
public class Sleep implements Scene{
    @Override
    public void getYoungAnswer(Young young) {
        System.out.println(young.name + "：十二点半才睡，精力旺盛。");
    }

    @Override
    public void getMiddleAgedAnswer(MiddleAged middleAged) {
        System.out.println(middleAged.name + "：十点半就睡，早睡早起身体好。");
    }
}
