package decorator.cake;

import java.math.BigDecimal;

public class CreamCake implements Cake{

    public String getDescription() {
        return "奶油蛋糕";
    }

    public BigDecimal cost() {
        return BigDecimal.valueOf(200);
    }

}
