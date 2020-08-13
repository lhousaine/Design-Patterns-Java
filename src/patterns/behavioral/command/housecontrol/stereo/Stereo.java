package patterns.behavioral.command.housecontrol.stereo;

public class Stereo {
    public Stereo(String living_room) {
    }

    public void on() {
        System.out.println("Stereo was turned on");
    }

    public void off() {
        System.out.println("Stereo was turned off");
    }

    public void setCD() {
        System.out.println("Stereo CD was setted");
    }

    public void setDVD() {
        System.out.println("Stereo DVD was setted");
    }

    public void setVolume(int i) {
        System.out.println("Stereo Volume was setted");
    }
}
