package pattern.command;

public class TVOnCommand implements Command {

    // 聚 合
    TVReceiver tv;
    // 构造器
    public TVOnCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tv.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tv.off();
    }
}
