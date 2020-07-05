package decorator.cake;

import java.math.BigDecimal;

public class DragonFruit extends CakeDecorator{

    public DragonFruit(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ",添加火龙果";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(10).add(cake.cost());
    }
}
