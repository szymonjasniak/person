package model;

import java.util.Objects;
import java.util.Optional;

public class Person {
    private String title;
    private String name;
    private String surname;
    private Integer age;

    public Person(String title, String name, String surname, Integer age) {
        this.title = Objects.requireNonNull(title, "Title cannot be null");
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.surname = Objects.requireNonNull(surname, "Surname cannot be null");
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(title, person.title) && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, name, surname, age);
    }
}
