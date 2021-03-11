package adapter.communication;

public class CommunicationAdpter implements Communication{

    private EffectiveCommunication effectiveCommunication;

    public CommunicationAdpter(EffectiveCommunication effectiveCommunication) {
        this.effectiveCommunication = effectiveCommunication;
    }

    /**
     * 关于工作
     */
    @Override
    public void aboutWork() {
        effectiveCommunication.betterWork();
    }

    /**
     * 关于吃饭
     */
    @Override
    public void aboutEate() {
        effectiveCommunication.betterEate();
    }

    /**
     * 关于睡觉
     */
    @Override
    public void aboutSleep() {
        effectiveCommunication.betterSleep();
    }
}
