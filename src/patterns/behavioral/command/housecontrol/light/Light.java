package patterns.behavioral.command.housecontrol.light;

public class Light {
    public Light(String living_room) {
    }

    public void on() {
        System.out.println("The light was turned on");
    }

    public void off() {
        System.out.println("The light was turned off");
    }
}
