package classtype.creational.FactoryMethod;

import classtype.creational.SimpleFactory.Operation;
import classtype.creational.SimpleFactory.OperationAdd;

public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
