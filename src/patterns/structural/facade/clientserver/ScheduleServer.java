package patterns.structural.facade.clientserver;

public class ScheduleServer {
    public void startBooting() {
        System.out.println("start booting");
    }

    public void initializeContext() {
        System.out.println("initialize context");
    }

    public void initializeListeners() {
        System.out.println("initialize listeners");
    }

    public void createSystemObjects() {
        System.out.println("create system objects");
    }

    public void destory() {
        System.out.println("destroy");
    }

    public void destroySystemObjects() {
        System.out.println("destroy System Obujects");
    }

    public void destoryListeners() {
        System.out.println("destroy Listeners");
    }

    public void destoryContext() {
        System.out.println("destroy Context");
    }

    public void shutdown() {
        System.out.println("shutdown");
    }

    public void releaseProcesses() {
        System.out.println("release Processes");
    }

    public void readSystemConfigFile() {
        System.out.println("read System Config File");
    }

    public void init() {
        System.out.println("init");
    }
}
