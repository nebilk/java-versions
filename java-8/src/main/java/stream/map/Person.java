package stream.map;

import java.util.List;
import java.util.Optional;

public class Person {
  private final int id;
  private final String name;
  private final String phone;
  private final List<String> addresses;

  public Person(int id, String name, String phone, List<String> addresses) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.addresses = addresses;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  public List<String> getAddresses() {
    return addresses;
  }

  @Override
  public String toString() {
    return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            ", addresses=" + addresses +
            '}';
  }
}