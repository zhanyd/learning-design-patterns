package composite.investment;

import java.util.Collections;

/**
 * 投资项目
 */
public class Project extends Component{

    String name;
    int price;
    public Project(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * 打印名称
     * @param depth
     */
    @Override
    public void print(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth, "--")) + name + " 投资：" + price);
    }

    /**
     * 返回金额
     * @return
     */
    @Override
    public int countSum() {
        return price;
    }
}
