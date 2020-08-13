package patterns.creational.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        System.out.println(chocolateBoiler.isEmpty());
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
        System.out.println(chocolateBoiler2.isEmpty());
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }
}
