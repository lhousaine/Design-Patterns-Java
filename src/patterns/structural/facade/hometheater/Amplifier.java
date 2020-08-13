package patterns.structural.facade.hometheater;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public Amplifier(Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer) {
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
    }

    public Amplifier() {

    }

    public void on() {
        System.out.println("Amplifier was turned On");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Amplifier Dvd was setted");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier setting surroundSound");
    }

    public void setVolume(int i) {
        System.out.println("setting Amplifier volume to " + i);
    }

    public void off() {
        System.out.println("Amplifier was turned Off");
    }
}
