package command;

public class ActionDownCommand implements Command {
    private Valokangas valokangas;

    public ActionDownCommand(Valokangas vk) {
        this.valokangas = vk;
    }

    @Override
    public void execute() {
        valokangas.setDown();
    }
}
