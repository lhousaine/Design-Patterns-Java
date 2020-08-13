package patterns.behavioral.command.housecontrol.stereo;

import patterns.behavioral.command.housecontrol.Command;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        this.stereo.off();
    }
}
