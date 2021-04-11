package composite.path.composite;

import java.util.Collections;

/**
 * 文件类
 */
public class File extends Component{

    String name;
    public File(String name) {
        this.name = name;
    }

    /**
     * 打印名称
     * @param depth
     */
    @Override
    public void print(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth, "--")) + name);
    }
}
