package patterns.behavioral.state;

import java.util.Scanner;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String location = scanner.nextLine();
        count = scanner.nextInt();
        GumballMachine gumballMachine = new GumballMachine(location, count);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();
    }
}
