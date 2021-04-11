package composite.path.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 目录类
 */
public class Directory extends Component{

    List<Component> componentList = new ArrayList<Component>();

    String name;
    public Directory(String name) {
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
        for (Component component : this.componentList) {
            component.print(depth + 2);
        }
    }
}
