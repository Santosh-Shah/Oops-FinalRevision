package inheritances.multiple;

interface A {
    public void printA();
}

interface B {
    public void printB();
}

class C implements A, B{
    public void printC() {
        System.out.println("print c");
    }

    @Override
    public void printB() {
        System.out.println("print b");
    }

    @Override
    public void printA() {
        System.out.println("print a");
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.printA();
        c.printB();
        c.printC();
    }
}
