package cmmand.siege;

/**
 * 具体的进攻命令类
 * @author zhanyd
 * @date 2020-12-26
 */
public class FireCommand {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void fire() {
        command.execute();
    }
}
