package patterns.behavioral.command.housecontrol;

public interface Command {
    public void execute();

    public void undo();
}