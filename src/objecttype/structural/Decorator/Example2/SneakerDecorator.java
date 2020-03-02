package objecttype.structural.Decorator.Example2;

public class SneakerDecorator extends FineryDecorator {
    @Override
    public void show() {
        System.out.println("运动鞋");
        super.show();
    }
}
