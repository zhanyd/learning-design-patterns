package observer.report;

public class TestObserver {

    public static void main(String[] args) {

        SalesDataSubject SalesDataSubject = new SalesDataSubject();

        PcObserver pcObserver = new PcObserver();
        IpadObserver ipadObserver = new IpadObserver();
        MobileObserver mobileObserver = new MobileObserver();

        // 添加观察者
        SalesDataSubject.attachObserver(pcObserver);
        SalesDataSubject.attachObserver(ipadObserver);
        SalesDataSubject.attachObserver(mobileObserver);
        // 通知观察者
        SalesDataSubject.notifyObserver();

        // 删除ipad观察者
        SalesDataSubject.detachObserver(ipadObserver);
        System.out.println("删除ipad端显示--------");
        // 通知观察者
        SalesDataSubject.notifyObserver();


    }
}
