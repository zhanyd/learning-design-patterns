package singleton.singleton;

public class GirlFriend3 {
    private static GirlFriend3 girlFriend;

    private String name;

    private GirlFriend3(String name) {
        this.name = name;
        System.out.println("机器人女友制作完成");
    }

    /**
     * 对象通过getInstance方法获取
     * @param name
     * @return
     */
    public synchronized static GirlFriend3 getInstance(String name) {
        if(girlFriend == null) {
            girlFriend = new GirlFriend3(name);
        }
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
