package objecttype.structural.Decorator.Struct;

public class Main {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        //首先用ConcreteComponent实例化对象c，然后用ConcreteDecoratorA实例化对象d1来包装c
        d1.setComponent(c);
        //再用ConcreteDecoratorB实例化对象d2包装d1
        d2.setComponent(d1);
        //最终执行d2的operation()
        d2.operation();
    }
}
