package memento.game.memento;

/**
 * 英雄类（就是Originator）
 */
public class Hero {

    /**
     * 生命值
     */
    private int healthPoint;

    /**
     * 魔法值
     */
    private int magicalValue;

    /**
     * 攻击力
     */
    private int attackPower;

    public Hero(int healthPoint, int magicalValue, int attackPower) {
        this.healthPoint = healthPoint;
        this.magicalValue = magicalValue;
        this.attackPower = attackPower;
    }

    /**
     * 游戏结束
     */
    public void gameOver() {
        this.healthPoint = 0;
        this.magicalValue = 0;
        this.attackPower = 0;
    }


    /**
     * 创建备忘录
     * @return
     */
    public Memento createMemento() {
        return new Memento(healthPoint, magicalValue, attackPower);
    }

    /**
     * 从备忘录中恢复数据
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.healthPoint = memento.getHealthPoint();
        this.magicalValue = memento.getMagicalValue();
        this.attackPower = memento.getAttackPower();
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("生命值：" + this.healthPoint + "\n");
        display.append("魔法值：" + this.magicalValue + "\n");
        display.append("攻击力：" + this.attackPower + "\n");
        return display.toString();
    }
}
