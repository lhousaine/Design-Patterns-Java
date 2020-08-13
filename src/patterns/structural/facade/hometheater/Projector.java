package patterns.structural.facade.hometheater;

public class Projector {
    DvdPlayer dvdPlayer;

    public Projector(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public Projector() {

    }

    public void on() {
        System.out.println("The projector was turned On");
    }

    public void wideScreenMode() {
        System.out.println("The projector screen was in wide screen mode");
    }

    public void off() {
        System.out.println("The projector was turned Off");
    }
}
