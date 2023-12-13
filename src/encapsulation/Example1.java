package encapsulation;
class Student {
    private String name;
    private int rollNo;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nRoll No: " + getRollNo() + "\nPassword: " + getPassword();
    }
}

public class Example1 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName("Hariom Shah");
        std1.setRollNo(12);
        std1.setPassword("4283");


        Student std2 = new Student();
        std1.setName("Santosh Shah");
        std1.setRollNo(13);
        std1.setPassword("7937");

        System.out.println(std1.toString());
    }
}
