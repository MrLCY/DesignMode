package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/***
 * 主题
 */
public interface Subject {
    List<Subject> list = new ArrayList<Subject>();
    public void addObserver(Observer observser);
    public void removeObserver(Observer observer);
    public void notifyObserver();


}
