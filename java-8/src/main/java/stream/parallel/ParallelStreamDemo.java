package stream.parallel;

import person.Person;
import person.PersonService;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        start = System.currentTimeMillis();
        IntStream.range(1, 1000).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Took : " + (end - start));

        start = System.currentTimeMillis();
        IntStream.range(1, 1000).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel Took : " + (end - start));

        IntStream.range(1, 10).forEach(
                x -> {
                    System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
                }
        );

        IntStream.range(1, 10).parallel().forEach(
                x -> {
                    System.out.println("Parallel Thread : " + Thread.currentThread().getName() + " : " + x);
                }
        );

        final List<Person> randomEmployees = PersonService.getRandomPeople();

        start = System.currentTimeMillis();
        final double salaryAverage = randomEmployees.stream()
                .map(Person::getAge)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Took : " + (end - start));
        System.out.println("Age : " + salaryAverage);

        start = System.currentTimeMillis();
        final double salaryAverageWithParallel = randomEmployees.parallelStream()
                .map(Person::getAge)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Parallel Took : " + (end - start));
        System.out.println("Parallel Age : " + salaryAverageWithParallel);
    }
}
