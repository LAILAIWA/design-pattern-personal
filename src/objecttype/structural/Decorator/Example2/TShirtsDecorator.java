package objecttype.structural.Decorator.Example2;

public class TShirtsDecorator extends FineryDecorator {
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
