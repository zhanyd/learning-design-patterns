package visitor.scene.visitor;

/**
 * 年终奖
 */
public class YearEndAwards implements Scene{

    @Override
    public void getYoungAnswer(Young young) {
        System.out.println(young.name + "：去买个最新款的手机或者其他电子产品，好好爽一爽，今朝有酒今朝醉。");
    }

    @Override
    public void getMiddleAgedAnswer(MiddleAged middleAged) {
        System.out.println(middleAged.name + "：全部拿去还房贷。");
    }
}
