package composite.investment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 投资品类
 */
public class Category extends Component{

    List<Component> componentList = new ArrayList<Component>();

    String name;
    public Category(String name) {
        this.name = name;
    }

    /**
     * 添加组件
     * @param
     */
    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    /**
     * 删除组件
     * @param component
     */
    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    /**
     * 打印名称
     * @param depth
     */
    @Override
    public void print(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth, "--")) + name);
        // 递归打印子组件
        for (Component component : componentList) {
            component.print(depth + 2);
        }
    }

    /**
     * 计算总金额
     * @return
     */
    @Override
    public int countSum() {
        int sum = 0;
        for (Component component : componentList) {
            sum += component.countSum();
        }
        return sum;
    }
}
