package objecttype.structural.Proxy.Struct;
//保存一个引用使得代理可以访问实体，并提供一个与Subject接口相同的接口，使代理可代替实体
public class Proxy extends Subject {
    RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
