package stream.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

class Person {
    private int identityNumber;
    private String name;
    private String lastName;
    private int age;

    public Person(int identityNumber, String name, String lastName, int age) {
        this.identityNumber = identityNumber;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "identityNumber=" + identityNumber +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public int getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(int identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class ParallelStreamDemo {

    private static List<Person> getRandomPersons() {
        List<Person> personList = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            personList.add(new Person(i, "person " + i, "lastName", new Random().nextInt(1000 * 100)));
        }
        return personList;
    }

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

        final List<Person> randomEmployees = getRandomPersons();

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
