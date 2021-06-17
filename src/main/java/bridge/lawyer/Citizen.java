package bridge.lawyer;

/**
 * 市民
 */
public abstract class Citizen {
    /**
     * 律师代理人
     */
    protected Lawyer lawyer;

    public Citizen(Lawyer lawyer) {
        this.lawyer = lawyer;
    }

    /**
     * 出庭
     */
    public abstract void appearInCourt();
}
