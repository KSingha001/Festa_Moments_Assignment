import java.util.ArrayList;
import java.util.List;

public class Java8FeaturesDemo {

    public static void main(String[] args) {

        List<Integer> salaries = new ArrayList<>();

        salaries.add(30000);
        salaries.add(55000);
        salaries.add(45000);
        salaries.add(70000);
        salaries.add(60000);

        System.out.println("Salaries greater than 50000:");

        salaries.stream()
                .filter(salary -> salary > 50000)
                .forEach(salary -> System.out.println(salary));
    }
}