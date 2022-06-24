package person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PersonService {

    //https://www.name-generator.org.uk/quick/
    public static List<Person> getPeople(){
        return Arrays.asList(
                new Person(1, "Reeva Buxton", 20, Gender.MALE, "+9011", Arrays.asList("Address 1", "Address 2")),
                new Person(2, "Ayra Estrada", 15, Gender.FEMALE, "+9022", Arrays.asList("Address 3", "Address 4")),
                new Person(3, "Kaydan Nixon", 5, Gender.MALE, "+9033", Arrays.asList("Address 5", "Address 6")),
                new Person(4, "Poppy Ellwood", 99, Gender.FEMALE, "+9044", Arrays.asList("Address 7", "Address 8")),
                new Person(5, "Elspeth Vincent", 120, Gender.FEMALE, "+9055", Arrays.asList("Address 9", "Address 10")),
                new Person(6, "Teegan England", 103, Gender.MALE, "+9066", Arrays.asList("Address 11", "Address 12")),
                new Person(7, "Karl Rodriquez", 50, Gender.MALE, "+9077", Arrays.asList("Address 13", "Address 14"))
        );
    }

    public static List<Person> getRandomPeople(){
        List<Person> personList = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {

            personList.add(
                    new Person(i,
                    "person " + i,
                    new Random().nextInt(1000 * 100),
                    i % 2 == 0 ? Gender.MALE : Gender.FEMALE,
                    "PHONE" + i,
                    Arrays.asList("ADDRESS1"+i, "ADDRESS2"+i)));
        }
        return personList;
    }
}
