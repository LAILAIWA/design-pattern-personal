package classtype.creational;

import classtype.creational.FactoryMethod.AddFactory;
import classtype.creational.FactoryMethod.IFactory;
import classtype.creational.SimpleFactory.Operation;
import classtype.creational.SimpleFactory.OperationFactory;

public class Test {
    public static void main(String[] args) {
        //简单工厂模式
        Operation operation = OperationFactory.createOperation("+");
        operation.set_numberA(1);
        operation.set_numberB(2);
        double result = operation.getResult();
        System.out.println("result = " + result);

        //工厂方法模式
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.createOperation();
        oper.set_numberA(1);
        oper.set_numberB(2);
        double result1 = oper.getResult();
        System.out.println("result1 = " + result1);
    }
}
