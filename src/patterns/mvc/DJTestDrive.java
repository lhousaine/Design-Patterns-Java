package patterns.mvc;

import patterns.mvc.controller.BeatController;
import patterns.mvc.controller.ControllerInterface;
import patterns.mvc.model.BeatModel;
import patterns.mvc.model.BeatModelInterface;

public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
