package command;

public class ActionUpCommand implements Command {
    Valokangas valokangas;

    public ActionUpCommand(Valokangas vk) {
        this.valokangas = vk;
    }

    @Override
    public void execute() {
        valokangas.setUp();
    }
}
