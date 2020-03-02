package objecttype.behavioral.Strategy.Struct;
//上下文
public class Context {
    Strategy strategy;

    //初始化时传入策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //根据具体的策略对象，调用其算法
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
