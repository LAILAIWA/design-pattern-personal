package objecttype.structural.Decorator.Struct;

public abstract class Decorator extends Component {
    protected Component component;

    public void setComponent(Component component) {//设置Component
        this.component = component;
    }

    @Override
    public void operation() {//重写operation()，实际执行仍是component.operation()
        if(component != null){
            component.operation();
        }
    }
}
