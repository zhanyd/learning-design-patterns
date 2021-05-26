package prototype.monster.pet.deepcopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 宠物
        Pet pet = new Pet("小石头人", "飞石");
        // 怪兽
        Monster monster = new Monster("山岭巨人", 300, 500, pet);
        // 怪兽副本
        Monster monsterClone = (Monster)monster.clone();
        // 同时复制宠物对象
        monsterClone.pet = (Pet)monster.pet.clone();

        System.out.println("monster :" + monster);
        System.out.println("monsterClone :" + monsterClone);
        System.out.println("----------------------------------------------------------------------------------------------");
        monsterClone.pet.setName("飞鹰");
        monsterClone.pet.setSkill("俯冲");
        System.out.println("monster :" + monster);
        System.out.println("monsterClone :" + monsterClone);
    }
}
