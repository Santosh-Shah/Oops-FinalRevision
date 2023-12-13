package abstractions;

abstract class AbstractClass {
    // abstract method
    public abstract void abstractMethod();

    // non-abstract method
    public void nonAbstractMethod() {
        System.out.println("This is non abstract method");
    }
}

class ConcreteClass extends AbstractClass {

    @Override
    public void abstractMethod() {
        System.out.println("This is abstract method from 'AbstractClass'");
    }
}

public class ExampleOne {
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.abstractMethod();
        concreteClass.nonAbstractMethod();
    }
}
