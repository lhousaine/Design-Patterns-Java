package patterns.compound.adapterDecorator;

public class DuckCall implements Quackable {
    public void quack() {
        System.out.println("Kwak");
    }
}
