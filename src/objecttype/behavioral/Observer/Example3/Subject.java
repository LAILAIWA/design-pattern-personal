package objecttype.behavioral.Observer.Example3;


public abstract class Subject {
    private EventHandler eventHandler = new EventHandler();
    public abstract void notifyy();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public abstract void addObserver(Object o,String methodName,Object... args);

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }
}
