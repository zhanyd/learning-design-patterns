package visitor.scene.visitor;

/**
 * 中年人
 */
public class MiddleAged implements Person{

    protected String name;

    public MiddleAged(String name) {
        this.name = name;
    }

    @Override
    public void accept(Scene scene) {
        scene.getMiddleAgedAnswer(this);
    }
}
