package patterns.behavioral.state;

/*
The State Pattern allows an object to alter its behavior
when its internal patterns.behavioral.state changes. The object will appear to
change its class.
 */
public interface State {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
