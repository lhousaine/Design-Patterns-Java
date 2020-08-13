package patterns.behavioral.command.housecontrol.garagedoor;

public class GarageDoor {

    public GarageDoor(String s) {
    }

    public void up() {
        System.out.println("Garage Door is Open");
    }

    public void down() {
        System.out.println("Garage Door is Closed");
    }

    public void stop() {
        System.out.println("Garage Door is Stop");
    }

    public void lightOn() {
        System.out.println("Garage Door is lightOn");
    }

    public void lightOff() {
        System.out.println("Garage Door is lightOff");
    }
}
