package cmmand.siege;

/**
 * 投石车攻击类
 * @author zhanyd
 * @date 2020-12-26
 */
public class CatapultFireCommand implements Command{
    private Catapult catapult;

    public CatapultFireCommand(Catapult catapult) {
        this.catapult = catapult;
    }

    /**
     * 投石车攻击
     */
    @Override
    public void execute() {
        catapult.loadStone();
        catapult.aim();
        catapult.fire();
    }
}
