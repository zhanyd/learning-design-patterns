package observer.report;

public class PcObserver implements Observer{

    public void update(double lastMonthSales, double thisMonthSales, double nextMonthSales) {
        System.out.println("PC上显示报表,上个月销售金额：" + lastMonthSales + "万,这个月销售金额：" +
                thisMonthSales + "万,下个月预计销售金额：" + nextMonthSales + "万");
    }
}
