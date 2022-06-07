# map

## map -> data transformation
map converts ["a", "b"] to ["A", "B"], it is only manipulate the value

```java
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(1, "Ali", "+9011", Arrays.asList("Address 1", "Address 2")),
                new Person(2, "Veli", "+9022", Arrays.asList("Address 3", "Address 4")),
                new Person(3, "Mehmet", "+9033", Arrays.asList("Address 5", "Address 6")),
                new Person(4, "Ahmet", "+9044", Arrays.asList("Address 7", "Address 8")),
                new Person(5, "Can", "+9055", Arrays.asList("Address 9", "Address 10")),
                new Person(6, "Cem", "+9066", Arrays.asList("Address 11", "Address 12")),
                new Person(7, "Osman", "+9077", Arrays.asList("Address 13", "Address 14"))
        );

        final List<String> phoneList = personList.stream()
                .map(Person::getPhone)
                .collect(Collectors.toList());
    }

}
```

Gets personList then convert it is a phoneList by using Person::getPhone method reference.

List<Person> convert List<String> -> data transformation

mapping : person -> person.getPhone()

this is a one to one mapping because every person has one phoneNumber

# flatMap


## flatMap -> data transformation + flattening
flatMap converts [["a", "b"],["c", "d"]] to ["a", "b", "c", "d"]

```java
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(1, "Ali", "+9011", Arrays.asList("Address 1", "Address 2")),
                new Person(2, "Veli", "+9022", Arrays.asList("Address 3", "Address 4")),
                new Person(3, "Mehmet", "+9033", Arrays.asList("Address 5", "Address 6")),
                new Person(4, "Ahmet", "+9044", Arrays.asList("Address 7", "Address 8")),
                new Person(5, "Can", "+9055", Arrays.asList("Address 9", "Address 10")),
                new Person(6, "Cem", "+9066", Arrays.asList("Address 11", "Address 12")),
                new Person(7, "Osman", "+9077", Arrays.asList("Address 13", "Address 14"))
        );

        final List<String> addressList = personList.stream()
                .map(Person::getAddresses)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(addressList);

        // OR
        final List<String> addressList2 = personList.stream()
                .flatMap(person -> person.getAddresses().stream())
                .collect(Collectors.toList());
        System.out.println(addressList2);
    }

}
```

mapping : person -> customer.getAddresses() 

this is one to many mapping because every customer possibly has more than one address.