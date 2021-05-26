package prototype.monster.pet.shallowcopy;

/**
 * 怪物类
 */
public class Monster implements Cloneable{

    /**
     * 名称
     */
    String name;

    /**
     * 攻击力
     */
    int attackPower;

    /**
     * 生命值
     */
    int hp;

    /**
     * 宠物
     */
    Pet pet;

    public Monster(String name, int attackPower, int hp, Pet pet) {
        this.name = name;
        this.attackPower = attackPower;
        this.hp = hp;
        this.pet = pet;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "怪物名称：" + name + "，攻击力：" + attackPower + "，生命值：" + hp + ", 宠物名称：" + pet.name + "，技能：" + pet.skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
