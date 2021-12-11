package command;

public class WallButton {
    private Command command;

    public WallButton(Command cmd) {
        this.command = cmd;
    }

    public void push() {
        command.execute();
    }
}
