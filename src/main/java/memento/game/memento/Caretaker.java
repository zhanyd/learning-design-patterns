package memento.game.memento;

/**
 * 负责人类
 */
public class Caretaker {

    /**
     * 备忘录
     */
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
