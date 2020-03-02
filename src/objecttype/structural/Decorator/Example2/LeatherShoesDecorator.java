package objecttype.structural.Decorator.Example2;

public class LeatherShoesDecorator extends FineryDecorator {
    @Override
    public void show() {
        System.out.println("皮鞋");
        super.show();
    }
}
