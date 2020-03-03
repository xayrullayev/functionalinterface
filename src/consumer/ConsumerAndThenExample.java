package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThenExample {
    public static void main(String[] args) {
        Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
        c.andThen(c).accept("Example Consumer functional interface");

        /**
         * Example 2
         */
        List<Students> students = Arrays.asList(
                new Students(1, 3, "John"),
                new Students(2, 4, "Jane"),
                new Students(3, 3,"Jack"));

        Consumer<Students> raiser = e -> {
            e.gpa = e.gpa * 1.1;
        };

        raiseStudents(students, System.out::println);
        raiseStudents(students, raiser.andThen(System.out::println));

    }
    private static void raiseStudents(List<Students> employees,
                                      Consumer<Students> fx) {
        for (Students e : employees) {
            fx.accept(e);
        }
    }
}
class Students {
    public int id;
    public double gpa;
    public String name;

    Students(int id, long g, String name) {
        this.id = id;
        this.gpa = g;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ">" + name + ": " + gpa;
    }
}
