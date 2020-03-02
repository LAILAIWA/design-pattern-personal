package classtype.creational.FactoryMethod;

import classtype.creational.SimpleFactory.Operation;
//工厂接口
public interface IFactory {
    Operation createOperation();
}
