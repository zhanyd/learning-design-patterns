package singleton.singleton;

import singleton.singleton.GirlFriend;

public class Test {

    public static void main(String[] args) {
        GirlFriend girlFriend = GirlFriend.getInstance("小丽");
        girlFriend.smile();
        girlFriend.housework();
        girlFriend.buKeMiaoShu();
    }
}
