package tasks;

import model.Person;

import java.util.List;

public class Task1 {

    public static List<Person> createPeople() {
        return List.of(
                new Person("Mr", "John", "Doe", 45),
                new Person("Ms", "Jane", "Smith", 38),
                new Person("Dr", "Emily", "White", null),
                new Person("Mr", "Michael", "Brown", 29),
                new Person("Mrs", "Anna", "Johnson", null),
                new Person("Dr", "Sarah", "Taylor", 42),
                new Person("Ms", "Laura", "Wilson", null),
                new Person("Mr", "David", "Jones", 55),
                new Person("Ms", "Sophia", "Garcia", 60),
                new Person("Dr", "Daniel", "Martinez", null),
                new Person("Mr", "James", "Miller", null),
                new Person("Mrs", "Linda", "Davis", 33)
        );
    }
}
