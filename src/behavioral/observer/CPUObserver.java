package behavioral.observer;

public class CPUObserver implements ResourceObserver {

    @Override
    public void update(String message) {
        System.out.println("[CPU Monitor] " + message);
    }
}