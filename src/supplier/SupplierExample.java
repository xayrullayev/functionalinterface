package supplier;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * Supplier takes no arguments, returns a value ( 5 variants )
 */
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> i  = ()-> "Example Supplier functional interface";

        System.out.println(i.get());

        /**
         * Example 2
         */
        SunPower power = new SunPower();

        SunPower p1 = produce(() -> power);
        SunPower p2 = produce(() -> power);

        System.out.println("Check the same object? " + Objects.equals(p1, p2));

        /**
         * Example 3
         */
        System.out.println(maker(Employee::new));

        /**
         * Example 4
         */
        Supplier<Student> studentGenerator = SupplierExample::employeeMaker;

        for (int idx = 0; idx < 10; idx++) {
            System.out.println("#" + idx + ": " + studentGenerator.get());
        }
    }
    public static SunPower produce(Supplier<SunPower> supp) {
        return supp.get();
    }
    private static Employee maker(Supplier<Employee> fx) {
        return fx.get();
    }
    public static Student employeeMaker() {
        return new Student("A",2);
    }
}
class SunPower {

    public SunPower() {
        System.out.println("Sun Power initialized..");
    }
}
class Employee {
    @Override
    public String toString() {
        return "A EMPLOYEE";
    }
}
class Student {
    public String name;
    public double gpa;

    Student(String name, double g) {
        this.name = name;
        this.gpa = g;
    }

    @Override
    public String toString() {
        return name + ": " + gpa;
    }
}
