package composite.path.composite;

/**
 * 组件类
 */
public abstract class Component {

    /**
     * 添加组件
     * @param
     */
    public void add(Component component) {
        throw new UnsupportedOperationException("不支添加操作");
    }

    /**
     * 删除组件
     * @param component
     */
    public void remove(Component component) {
        throw new UnsupportedOperationException("不支删除操作");
    }

    /**
     * 打印名称
     * @param depth
     */
    public abstract void print(int depth);
}
