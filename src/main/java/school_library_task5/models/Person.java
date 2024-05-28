package school_library_task5.models;

import school_library_task5.enums.Gender;
import school_library_task5.enums.Role;

public class Person {

    private String fullName;
    private int age;
    private String id;
    private Gender gender;
    private Role role;

    public Person(String fullName, int age, String id, Gender gender, Role role) {
        this.fullName = fullName;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", gender=" + gender +
                ", role=" + role +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public Gender getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }
}