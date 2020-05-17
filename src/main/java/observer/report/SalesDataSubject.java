package observer.report;

import java.util.ArrayList;
import java.util.List;

public class SalesDataSubject implements Subject{

    private List<Observer> observers = new ArrayList<Observer>();

    // 上个月销售额
    private double lastMonthSales = 90;
    // 这个月销售额
    private double thisMonthSales = 100;
    // 下个月销售额预计
    private double nextMonthSales = 105;


    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(lastMonthSales, thisMonthSales, nextMonthSales);
        }
    }
}
