package decorator.cake;

import java.math.BigDecimal;

public class Cherry extends CakeDecorator{

    public Cherry(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ",添加樱桃";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(30).add(cake.cost());
    }
}
