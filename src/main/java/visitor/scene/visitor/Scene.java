package visitor.scene.visitor;

/**
 * 场景
 */
public interface Scene {

    /**
     * 年轻人的回答
     * @param young
     */
    public void getYoungAnswer(Young young);

    /**
     * 中年人的回答
     * @param middleAged
     */
    public void getMiddleAgedAnswer(MiddleAged middleAged);
}
