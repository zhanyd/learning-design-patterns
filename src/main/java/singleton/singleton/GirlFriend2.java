package singleton.singleton;

public class GirlFriend2 {

    // 在类加载的时候就创建对象，是线程安全的
    private static GirlFriend2 girlFriend = new GirlFriend2("小丽");

    private String name;

    private GirlFriend2(String name) {
        this.name = name;
        System.out.println("机器人女友制作完成");
    }

    /**
     * 对象通过getInstance方法获取
     * @return
     */
    public static GirlFriend2 getInstance() {
        return girlFriend;
    }

    public void smile() {
        System.out.println("笑一个 :-)");
    }

    public void housework() {
        System.out.println("去干家务");
    }

    public void buKeMiaoShu() {
        System.out.println(".......");
    }
}
