package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ResourceMonitor {

    private List<ResourceObserver> observers = new ArrayList<>();

    public void addObserver(ResourceObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (ResourceObserver observer : observers) {
            observer.update(message);
        }
    }
}