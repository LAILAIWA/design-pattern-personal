package objecttype.behavioral.Strategy.Struct;

//客户端
public class Main {

    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();
        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();
        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
