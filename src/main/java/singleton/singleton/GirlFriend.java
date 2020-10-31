package singleton.singleton;

public class GirlFriend {

    // volatile关键字保证了每个线程看到的girlFriend对象都是最新的
    private volatile static GirlFriend girlFriend;

    private String name;

    private GirlFriend(String name) {
        this.name = name;
        System.out.println("机器人女友制作完成");
    }

    /**
     * 对象通过getInstance方法获取
     * @param name
     * @return
     */
    public static GirlFriend getInstance(String name) {
        if(girlFriend == null) {
            synchronized (GirlFriend.class) {
                if (girlFriend == null) {
                    girlFriend = new GirlFriend(name);
                }
            }
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
