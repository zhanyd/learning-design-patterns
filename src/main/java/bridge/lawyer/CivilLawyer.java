package bridge.lawyer;

/**
 * 民事律师
 */
public class CivilLawyer implements Lawyer{

    /**
     * 辩论
     */
    @Override
    public void debate() {
        System.out.println("民事律师在法庭上进行民事案件辩论。");
    }
}
