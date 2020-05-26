package factory.wuxia.abstractFactory;

public class XingJunDanDrug extends Drug {

    public XingJunDanDrug() {
        name = "行军丹";
        System.out.println("开始制作：祖传秘法秘制七天");
        System.out.println("制作完成-->行军丹");
        efficacy = "江湖中常见的疗伤药丸，尺寸小，便于携带，服用后见效快，恢复生命100点。";
    }
}
