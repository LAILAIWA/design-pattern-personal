package objecttype.creational.Builder.Struct;

import java.util.ArrayList;
import java.util.List;
//产品类
public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part){
        //增加产品部件
        parts.add(part);
    }

    public void show(){
        System.out.println("\n 产品 创建 ----");
        for(String part : parts){
            System.out.println(part);
        }
    }

}
