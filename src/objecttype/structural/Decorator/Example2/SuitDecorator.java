package objecttype.structural.Decorator.Example2;

public class SuitDecorator extends FineryDecorator {
    @Override
    public void show() {
        System.out.println("西装");
        super.show();
    }
}
