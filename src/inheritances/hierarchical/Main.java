package inheritances.hierarchical;

class A {
    public void printA() {
        System.out.println("This is A");
    }
}

class B extends A {
    public void printB() {
        System.out.println("This is B");
    }
}

class C extends A {
    public void printC() {
        System.out.println("This is C");
    }
}

class D extends A {
    public void printD() {
        System.out.println("This is D");
    }
}

public class Main {
    public static void main(String[] args) {
        D d = new D();
        d.printD();
        d.printA();

        C c = new C();
        c.printC();
        c.printA();

        B b = new B();
        b.printA();
        b.printB();
    }
}
