package cmmand.siege;

import java.util.ArrayList;
import java.util.List;

/**
 * 批量进攻命令类
 * @author zhanyd
 * @date 2020-12-26
 */
public class BatchFireCommand {
    List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command) {
        this.commandList.add(command);
    }

    public void fire() {
        commandList.stream().forEach(f -> f.execute());
    }
}
