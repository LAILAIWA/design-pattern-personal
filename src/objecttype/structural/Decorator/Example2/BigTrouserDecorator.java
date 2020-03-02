package objecttype.structural.Decorator.Example2;

public class BigTrouserDecorator extends FineryDecorator {
    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
