package builder.wuxia.builder;

public class Drug {

    /**
     * 药品名称
     */
    private String name;

    /**
     * 是否已混合
     */
    private boolean isMixed;

    /**
     * 是否已浸泡
     */
    private boolean isSoakd;

    /**
     * 是否已加入秘药
     */
    private boolean hasSecretMedicine;

    /**
     * 是否已炼制
     */
    private boolean isRefine;

    /**
     * 是否已晾晒
     */
    private boolean isDry;

    /**
     * 是否已密封
     */
    private boolean isSeal;

    public Drug(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " 生产情况 ----\n");
        display.append("是否已混合：" + isMixed+ "\n");
        display.append("是否已浸泡：" + isSoakd+ "\n");
        display.append("是否已加入秘药：" + hasSecretMedicine+ "\n");
        display.append("是否已炼制：" + isRefine+ "\n");
        display.append("是否已晾晒：" + isDry+ "\n");
        display.append("是否已密封：" + isSeal+ "\n");
        return display.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMixed() {
        return isMixed;
    }

    public void setMixed(boolean mixed) {
        isMixed = mixed;
    }

    public boolean isSoakd() {
        return isSoakd;
    }

    public void setSoakd(boolean soakd) {
        isSoakd = soakd;
    }

    public boolean isHasSecretMedicine() {
        return hasSecretMedicine;
    }

    public void setHasSecretMedicine(boolean hasSecretMedicine) {
        this.hasSecretMedicine = hasSecretMedicine;
    }

    public boolean isRefine() {
        return isRefine;
    }

    public void setRefine(boolean refine) {
        isRefine = refine;
    }

    public boolean isDry() {
        return isDry;
    }

    public void setDry(boolean dry) {
        isDry = dry;
    }

    public boolean isSeal() {
        return isSeal;
    }

    public void setSeal(boolean seal) {
        isSeal = seal;
    }

}
