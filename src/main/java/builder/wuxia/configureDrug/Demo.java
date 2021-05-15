package builder.wuxia.configureDrug;

public class Demo {
    public static void main(String[] args) {
        Drug drug = new DrugBuilder()
                .setName("大力丸")
                .setType(1)
                .setTaste(0)
                .setSize(2)
                .setNum(10)
                .build();

        System.out.println(drug);
    }
}
