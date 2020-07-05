package decorator.cake;

import java.math.BigDecimal;

public class Strawberry extends CakeDecorator{

    public Strawberry(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ",添加草莓";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(15).add(cake.cost());
    }
}
