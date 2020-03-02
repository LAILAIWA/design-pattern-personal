package objecttype.structural.Decorator.Example1;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装扮——" + name);
    }
}
