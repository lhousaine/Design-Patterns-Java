package patterns.structural.facade.hometheater;

public class TheaterLights {

    public void dim(int i) {
        System.out.println("The TheatherLights dimension was setted to " + i);
    }

    public void on() {
        System.out.println("The TheatherLights was turned On");
    }
}
