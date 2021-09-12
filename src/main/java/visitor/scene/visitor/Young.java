package visitor.scene.visitor;

/**
 * 年轻人
 */
public class Young implements Person{

    protected String name;

    public Young(String name) {
        this.name = name;
    }

    @Override
    public void accept(Scene scene) {
        scene.getYoungAnswer(this);
    }
}
