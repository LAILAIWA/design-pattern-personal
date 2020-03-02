package objecttype.creational.Builder.Struct;
//指挥者类
public class Director {

    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
