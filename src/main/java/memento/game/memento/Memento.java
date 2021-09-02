package memento.game.memento;

public class Memento {

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

    public Memento(int healthPoint, int magicalValue, int attackPower) {
        this.healthPoint = healthPoint;
        this.magicalValue = magicalValue;
        this.attackPower = attackPower;
    }

    /**
     * 备忘录中只有get方法，没有set方法，因为备忘录中的数据不应该被修改
     * @return
     */
    public int getHealthPoint() {
        return healthPoint;
    }

    /**
     * 备忘录中只有get方法，没有set方法，因为备忘录中的数据不应该被修改
     * @return
     */
    public int getMagicalValue() {
        return magicalValue;
    }

    /**
     * 备忘录中只有get方法，没有set方法，因为备忘录中的数据不应该被修改
     * @return
     */
    public int getAttackPower() {
        return attackPower;
    }

}
