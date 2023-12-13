package inheritances.single;

class Parent {
    public void print1() {
        System.out.println("THis is print one");
    }
}

class Child extends Parent {
    public void print2() {
        System.out.println("THis is print two");
    }
}


public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.print1();
        child.print2();
    }
}
