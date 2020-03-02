package objecttype.structural.Decorator.Example2;

public class TieDecorator extends FineryDecorator {
    @Override
    public void show() {
        System.out.println("领带");
        super.show();
    }
}
