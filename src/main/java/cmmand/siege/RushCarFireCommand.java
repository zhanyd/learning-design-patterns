package cmmand.siege;

/**
 * 冲车攻击类
 * @author zhanyd
 * @date 2020-12-26
 */
public class RushCarFireCommand implements Command {
    private RushCar rushCar;

    public RushCarFireCommand(RushCar rushCar) {
        this.rushCar = rushCar;
    }

    /**
     * 冲车攻击
     */
    @Override
    public void execute() {
        rushCar.move();
        rushCar.hit();
    }
}
