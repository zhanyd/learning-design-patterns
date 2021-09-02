package memento.game.normal;

/**
 * 英雄
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
     * 设置属性
     * @param healthPoint
     * @param magicalValue
     * @param attackPower
     */
    public void setState(int healthPoint, int magicalValue, int attackPower) {
        this.healthPoint = healthPoint;
        this.magicalValue = magicalValue;
        this.attackPower = attackPower;
    }


    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("生命值：" + this.healthPoint + "\n");
        display.append("魔法值：" + this.magicalValue + "\n");
        display.append("攻击力：" + this.attackPower + "\n");
        return display.toString();
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getMagicalValue() {
        return magicalValue;
    }

    public void setMagicalValue(int magicalValue) {
        this.magicalValue = magicalValue;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
