package patterns.structural.flyweight.platforms;

import patterns.structural.flyweight.Code;
import patterns.structural.flyweight.Platform;

public class CPlatform implements Platform {
    public CPlatform() {
        System.out.println("CPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing C code.");
    }
}
