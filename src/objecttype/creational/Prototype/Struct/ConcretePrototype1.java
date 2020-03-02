package objecttype.creational.Prototype.Struct;

public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        //创建当前对象的浅表副本
        return (Prototype) this.memberwiseClone();
    }

    private ConcretePrototype1 memberwiseClone(){
        //创建一个新的对象，然后将当前对象的非静态字段复制到该新对象。
        //如果字段是值类型的，则对该字段执行逐位复制。
        //如果字段是引用类型，则复制引用但不复制引用的对象；
        //因此，原始对象及其副本引用同一对象
        return new ConcretePrototype1(this.getId());
    }
}
