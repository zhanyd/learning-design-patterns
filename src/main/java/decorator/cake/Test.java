package decorator.cake;

public class Test {

    public static void main(String[] args) {
        // 标准奶油蛋糕
        Cake cake = new CreamCake();
        // 添加樱桃
        cake = new Cherry(cake);
        // 添加草莓
        cake = new Strawberry(cake);
        // 添加火龙果
        cake = new DragonFruit(cake);
        // 双份樱桃，土豪啊
        cake = new Cherry(cake);

        System.out.println(cake.getDescription());
        System.out.println("合计：" + cake.cost());
    }
}
