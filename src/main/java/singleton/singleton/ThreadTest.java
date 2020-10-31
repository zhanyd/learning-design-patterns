package singleton.singleton;

public class ThreadTest {

    public static void main(String[] args){
        for(int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    GirlFriend girlFriend = GirlFriend.getInstance("小丽");
                    System.out.println(girlFriend);
                }
            }).start();
        }
    }
}
