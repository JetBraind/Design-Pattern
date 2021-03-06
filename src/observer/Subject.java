package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 */
public class Subject {
    protected List<Observer> list = new ArrayList<>();

    public void register(Observer observer) {
        list.add(observer);
    }

    public void remove(Observer observer) {
        list.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : list) {
            observer.update(this);
        }
    }
}
