package inheritances.multilevel;

class Parent1 {
    public void print1() {
        System.out.println("This is parent 1");
    }
}

class Child1 extends Parent1{
    public void print2() {
        System.out.println("This is child 1");
    }
}

class Child2 extends Child1 {
    public void print3() {
        System.out.println("This is child 2");
    }
}

public class Main {
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.print1();
        child2.print2();
        child2.print3();
    }
}
