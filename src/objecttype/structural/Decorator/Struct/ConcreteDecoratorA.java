package objecttype.structural.Decorator.Struct;

public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void operation() {
        super.operation();//先运行原Component的operation
        addedState = "New State";//再执行本类的功能如addedState，相当于对原Component进行了装饰
        System.out.println("具体装饰对象A的操作");
    }
}
