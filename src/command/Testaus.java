package command;

public class Testaus {
    public static void main(String[] args) {
        Valokangas valokangas = new Valokangas();
        ActionUpCommand actionUp = new ActionUpCommand(valokangas);
        ActionDownCommand actionDown = new ActionDownCommand(valokangas);

        WallButton upBtn = new WallButton(actionUp);
        WallButton downBtn = new WallButton(actionDown);

        upBtn.push();
        downBtn.push();
    }
}
