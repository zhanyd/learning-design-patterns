package composite.path.normal;

import java.util.List;

public interface IBranch {
    /**
     * 打印目录名
     * @param depth
     */
    void print(int depth);

    /**
     * 添加目录
     * @param branch
     */
    void add(IBranch branch);

    /**
     * 添加文件
     * @param leaf
     */
    void add(ILeaf leaf);

    /**
     * 获目录内容
     * @return
     */
    List<Object> getSubList();
}
