package factory.wuxia.abstractFactory;

public class SuperJinChuangYaoDrug extends Drug {

    public SuperJinChuangYaoDrug() {
        name = "超级金疮药";
        System.out.println("开始制作：祖传秘法秘制七七四十九天");
        System.out.println("制作完成-->超级金疮药");
        efficacy = "闻名天下的佛门疗伤奇药，闯荡江湖必备，加速愈合，服用后立即恢复生命500点，具备超级功效-->同时恢复250点内力。";
    }
}
