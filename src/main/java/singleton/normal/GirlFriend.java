package singleton.normal;

public class GirlFriend {

    private String name;

    public GirlFriend(String name) {
        this.name = name;
        System.out.println("机器人女友制作完成");
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
