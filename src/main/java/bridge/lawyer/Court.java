package bridge.lawyer;

/**
 * 法庭
 */
public class Court {
    public static void main(String[] args) {
        // 小帅通过律师事务所找到经济律师
        Citizen xiaoShuai = new XiaoShuai(new EconomicLawyer());
        // 小帅出庭
        xiaoShuai.appearInCourt();

        // 小美通过律师事务所找到民事律师
        Citizen xiaoMei = new XiaoMei(new CivilLawyer());
        // 小美出庭
        xiaoMei.appearInCourt();
    }
}
