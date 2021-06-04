package ch.abbts.nds.swe.swdt.jinder.nottdd;

public class Employee {

    private int age;

    public Employee(int age) {
        this.age = age;
    }


    public boolean isOfAge(int age){
        return this.age > age;
    }
}
