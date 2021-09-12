package visitor.scene.normal;

/**
 * 人的抽象类
 */
public abstract class Person {
    /**
     * 场景
     */
    protected String scene;

    public Person(String scene) {
        this.scene = scene;
    }

    /**
     * 回答
     */
    public abstract void answer();
}
