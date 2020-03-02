package objecttype.behavioral.Observer.Example2;

import objecttype.behavioral.Observer.Example1.Secretary;

public abstract class Observer {
    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
