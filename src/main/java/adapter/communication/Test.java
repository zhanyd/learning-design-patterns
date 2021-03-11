package adapter.communication;

public class Test {

    public static void main(String[] args) {

        System.out.println("家长式的唠叨******");
        NormalCommunication normalCommunication = new NormalCommunication();
        normalCommunication.aboutEate();
        normalCommunication.aboutWork();
        normalCommunication.aboutSleep();

        System.out.println();
        System.out.println("和年轻人的沟通方式******");
        CommunicationAdpter communicationAdpter = new CommunicationAdpter(new EffectiveCommunication());
        communicationAdpter.aboutEate();
        communicationAdpter.aboutWork();
        communicationAdpter.aboutSleep();
    }
}
