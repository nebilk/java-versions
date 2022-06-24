package stream.map;


import person.Person;
import person.PersonService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapDemo {

  // find given name list
  // find their lengths and transform them to a list
  private static void findLengthGivenNameList(){
    final List<String> nameList = Arrays.asList("Ali", "Veli", "Ahmet", "Mehmet");
    final List<Integer> collect = nameList.stream()
            .map(String::length)
            .collect(Collectors.toList());
    System.out.println(collect);
  }

  //find unique characters of given list
  private static void findUniqueCharacters(){
    final List<String> words = Arrays.asList(
            "a", "b", "c", "dd", "bb", "1");

    final List<String> collect = words.stream()
            .map(s -> s.split(""))
            .flatMap(Arrays::stream)
            .distinct()
            .collect(Collectors.toList());
    System.out.println(collect);
    /**
     * e.g  = Arrays.asList("a", "b", "c", "dd", "bb", "1")
     * stream -> "a", "b", "c", "dd", "bb", "1"
     * map -> ["a"], ["b"], ["c"], ["d", "d"], ["b", "b"], ["1"]
     * flatMap -> ["a", "b", "c", "d", "d", "b", "b", "1"]
     * distinct -> ["a", "b", "c", "d", "1"]
     */
  }

  private static void printPhoneList(List<Person> personList){
    final List<String> phoneList = personList.stream()
            .map(Person::getPhone)
            .collect(Collectors.toList());
    System.out.println(phoneList);
  }

  private static void printAddressList(List<Person> personList){
    // this give us wrong output, map only transform data
    final List<List<String>> addressListList = personList.stream()
            .map(Person::getAddresses)
            .collect(Collectors.toList());
    System.out.println(addressListList);

    // we have to use flatMap to transform + flattening
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

  private static void multiplyNumberArray(List<Integer> numberList){

    final List<Integer> collect = numberList.stream()
            .map(val -> val * 10)
            .collect(Collectors.toList());
    System.out.println(collect);
  }

  private static void multiplyAndAddElements(List<Integer> numberList){
    final List<Integer> collect = numberList.stream()
            .flatMap(val -> Stream.of(val * 2, val + 20))
            .collect(Collectors.toList());

    System.out.println(collect);
  }

  private static void mergeAndPrintArray(){
    int[] array1 = new int[] {11, 22, 33, 45};
    int[] array2 = new int[] {11, 22, 33, 45, 50};
    Stream.of(array1, array2).flatMapToInt(IntStream::of).forEach(System.out::println);
  }

  private static void mergeAndFindMax(){
    int[] array1 = new int[] {11, 22, 33, 45};
    int[] array2 = new int[] {11, 22, 33, 45, 50};

    Stream.of(array1, array2).flatMapToInt(IntStream::of).max().ifPresent(System.out::println);
  }

  public static void main(String[] args) {

    findLengthGivenNameList();

    System.out.println("------------------");

    findUniqueCharacters();

    System.out.println("------------------");

    List<Person> personList = PersonService.getRandomPeople();

    printPhoneList(personList);

    System.out.println("------------------");

    printAddressList(personList);

    System.out.println("------------------");

    List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6);

    multiplyNumberArray(numberList);

    System.out.println("------------------");

    multiplyAndAddElements(numberList);

    System.out.println("------------------");

    mergeAndPrintArray();

    System.out.println("------------------");

    mergeAndFindMax();


  }
}
