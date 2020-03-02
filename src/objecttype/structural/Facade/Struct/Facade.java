package objecttype.structural.Facade.Struct;

public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        this.one = new SubSystemOne();
        this.two = new SubSystemTwo();
        this.three = new SubSystemThree();
        this.four = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("\n方法组A() --- ");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB(){
        System.out.println("\n方法组B() --- ");
        two.methodTwo();
        three.methodThree();
    }

}
