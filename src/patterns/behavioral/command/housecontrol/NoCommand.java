package patterns.behavioral.command.housecontrol;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Now Command was executed");
    }

    @Override
    public void undo() {
        System.out.println("Now Command undo");
    }
}
