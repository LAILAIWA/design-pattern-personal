package objecttype.behavioral.Observer.Example2;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String action;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyy() {
        for(Observer o : observers){
            o.update();
        }
    }

    @Override
    public String getSecretaryAction(){
        return action;
    }

    @Override
    public void setSecretaryAction(String value){
        action = value;
    }
}
