package patterns.structural.facade.hometheater;

public class DvdPlayer {
    Amplifier amplifier;

    public DvdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public DvdPlayer() {

    }

    public void on() {
        System.out.println("dvdPlayer was setted On");
    }

    public void play(String movie) {
        System.out.println("dvdPlayer was in played mode");
    }

    public void eject() {
        System.out.println("dvdPlayer was ejected");
    }

    public void stop() {
        System.out.println("dvdPlayer was stoped");
    }

    public void off() {
        System.out.println("dvdPlayer was turned Off");
    }
}
