package patterns.structural.flyweight.platforms;

import patterns.structural.flyweight.Code;
import patterns.structural.flyweight.Platform;

public class JavaPlatform implements Platform {
    public JavaPlatform() {
        System.out.println("JavaPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Java code.");
    }
}