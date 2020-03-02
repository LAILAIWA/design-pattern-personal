package classtype.creational.SimpleFactory;

/**
 * 简单工厂模式实现计算器
 */
public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
