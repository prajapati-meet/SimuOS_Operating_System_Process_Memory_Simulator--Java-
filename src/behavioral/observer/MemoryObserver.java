package behavioral.observer;

public class MemoryObserver implements ResourceObserver {

    @Override
    public void update(String message) {
        System.out.println("[Memory Monitor] " + message);
    }
}