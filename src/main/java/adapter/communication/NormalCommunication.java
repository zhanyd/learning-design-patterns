package adapter.communication;

public class NormalCommunication implements Communication{

    /**
     * 关于工作
     */
    @Override
    public void aboutWork() {
        System.out.println("关于工作：好好工作，不要乱花钱，多存点钱。");
    }

    /**
     * 关于吃饭
     */
    @Override
    public void aboutEate() {
        System.out.println("关于垃圾食品：不要天天吃外卖，夜宵，要保重身体，注意饮食健康。");
    }

    /**
     * 关于睡觉
     */
    @Override
    public void aboutSleep() {
        System.out.println("关于睡觉：不要熬夜，要早点睡。");
    }
}
