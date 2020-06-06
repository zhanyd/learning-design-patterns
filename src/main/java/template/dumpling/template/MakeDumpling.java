package template.dumpling.template;

public class MakeDumpling {

    public static void main(String[] args) {
        // 制作韭菜馅饺子
        System.out.println("制作韭菜馅饺子");
        LeekDumpling leekDumpling = new LeekDumpling();
        leekDumpling.makeDumpling();

        System.out.println();
        // 制作猪肉馅饺子
        System.out.println("制作猪肉馅饺子");
        PorkDumpling porkDumpling = new PorkDumpling();
        porkDumpling.makeDumpling();
    }
}
