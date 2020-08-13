package patterns.structural.proxy.rmi;

import java.rmi.*;

public class GumballMonitor implements GumballMachineRemote {

    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine : " + machine.getLocation());
            System.out.println("Current inventory : " + machine.getCount() + " gumballs");
            System.out.println("Current patterns.behavioral.state : " + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getCount() throws RemoteException {
        return machine.getCount();
    }

    @Override
    public String getLocation() throws RemoteException {
        return machine.getLocation();
    }

    @Override
    public State getState() throws RemoteException {
        return machine.getState();
    }
}