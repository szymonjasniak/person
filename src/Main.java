import model.Person;

import java.util.List;

import static tasks.Task1.createPeople;
import static tasks.Task2.getThreeOldest;
import static tasks.Task3.groupByTitleAndModify;
import static tasks.Task4.mergeCollections;

public class Main {
    public static void main(String[] args) {
        List<Person> people = createPeople();

        System.out.println("3 oldest people: " + getThreeOldest(people));

        groupByTitleAndModify(people);

        List<Person> morePeople = List.of(
                // new person
                new Person("Ms", "Alice", "Walker", 50),
                // duplicated person
                new Person("Mr", "David", "Jones", 55)
        );

        List<Person> mergedList = mergeCollections(people, morePeople);
//        List<Person> mergedList = mergeCollections(people, createPeople());
        System.out.println("Merged list without duplicates:");
        mergedList.forEach(System.out::println);
    }


}