package cmmand.siege;

/**
 * 魔法师攻击类
 * @author zhanyd
 * @date 2020-12-26
 */
public class MagicianFireCommand implements Command{
    private Magician magician;

    public MagicianFireCommand(Magician magician) {
        this.magician = magician;
    }

    /**
     * 魔法师攻击
     */
    @Override
    public void execute() {
        magician.chant();
        magician.summonMeteor();
    }
}
