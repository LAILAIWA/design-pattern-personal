package objecttype.structural.Decorator.Example2;

import objecttype.structural.Decorator.Example1.Person;

public class FineryDecorator extends Person {
    protected Person component;

    public FineryDecorator() {
    }

    public void setComponent(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if(component != null){
            component.show();
        }
    }
}
