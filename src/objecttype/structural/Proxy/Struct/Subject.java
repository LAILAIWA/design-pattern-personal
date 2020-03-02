package objecttype.structural.Proxy.Struct;
//定义了RealSubject和Proxy的共用接口，这样就可以在使用RealSubject的地方使用Proxy
public abstract class Subject {
    public abstract void request();
}
