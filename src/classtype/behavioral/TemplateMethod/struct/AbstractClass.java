package classtype.behavioral.TemplateMethod.struct;
//抽象模板
public abstract class AbstractClass {
    //一些抽象行为，放到子类中实现
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    //模板方法，给出了逻辑的骨架，而逻辑的组成是一些相应的抽象操作，它们都推迟到子类实现
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("");;
    }
}
