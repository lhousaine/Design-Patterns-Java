package patterns.structural.flyweight.platforms;

import patterns.structural.flyweight.Code;
import patterns.structural.flyweight.Platform;

public class CPPPlatform implements Platform {
    public CPPPlatform() {
        System.out.println("CPPPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing CPP code.");
    }
}
