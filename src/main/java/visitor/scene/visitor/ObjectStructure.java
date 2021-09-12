package visitor.scene.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 */
public class ObjectStructure {

    private List<Person> personList = new ArrayList<>();

    /**
     * 新增
     * @param person
     */
    public void add(Person person) {
        personList.add(person);
    }

    /**
     * 删除
     * @param person
     */
    public void delete(Person person) {
        personList.remove(person);
    }

    /**
     * 遍历显示
     * @param scene
     */
    public void display(Scene scene) {
        personList.stream().forEach(f -> f.accept(scene));
    }
}
