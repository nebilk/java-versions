package person;

import java.util.List;

public class Person {
    private int id;
    private String name;
    private int age;
    private Gender gender;

    private String phone;
    private List<String> addresses;

    public Person(int id, String name, int age, Gender gender, String phone, List<String> addresses) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", addresses=" + addresses +
                '}';
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public List<String> getAddresses() {
        return addresses;
    }
}
