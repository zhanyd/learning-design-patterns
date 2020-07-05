package decorator.cake;

import java.math.BigDecimal;

public class CakeDecorator implements Cake{

    Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    public String getDescription() {
        return cake.getDescription();
    }

    public BigDecimal cost() {
        return cake.cost();
    }

}
