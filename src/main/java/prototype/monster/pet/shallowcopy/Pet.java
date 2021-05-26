package prototype.monster.pet.shallowcopy;

/**
 * 宠物类
 */
public class Pet {

    /**
     * 名称
     */
    String name;

    /**
     * 技能
     */
    String skill;

    public Pet(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "宠物名称：" + name + "，技能：" + skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
