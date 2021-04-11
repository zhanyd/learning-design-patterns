package composite.investment;

public class BuildProject {

    public static void main(String[] args) {
        Category root = new Category("永久组合");

        Project cash = new Project("现金",25000);
        Project paperGold = new Project("纸黄金", 25000);
        root.add(cash);
        root.add(paperGold);

        Category indexFund = new Category("指数基金");
        Project hushen300 = new Project("沪深300",10000);
        Project zhongzheng500 = new Project("中证500",10000);
        Project chaungyeban = new Project("创业板指数",5000);
        indexFund.add(hushen300);
        indexFund.add(zhongzheng500);
        indexFund.add(chaungyeban);
        // 指数基金添加到永久组合中
        root.add(indexFund);

        Category bondFund = new Category("债券基金");
        Project hybridBondFund = new Project("混合债券基金", 15000);
        Project prueBondFund = new Project("纯债券基金", 10000);
        Project corporateonds = new Project("企业债券", 5000);
        bondFund.add(hybridBondFund);
        bondFund.add(prueBondFund);
        bondFund.add(corporateonds);
        // 企业债券风险太高，删掉
        bondFund.remove(corporateonds);
        // 把pictures文件夹添加到根目录
        root.add(bondFund);

        root.print(0);
        System.out.println("投资总金额：" + root.countSum());
    }
}
