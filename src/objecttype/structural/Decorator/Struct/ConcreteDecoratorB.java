package objecttype.structural.Decorator.Struct;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();//先运行原Component的operation
        addedBehavior();//再执行本类的功能如addedBehavior()，相当于对原Component进行了装饰
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior(){//本类独有方法，区别于ConcreteDecoratorA
        System.out.println("addedBehavior");
    }
}

