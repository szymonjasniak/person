package tasks;

import model.Person;

import java.util.List;
import java.util.stream.Stream;

public class Task4 {
    public static List<Person> mergeCollections(List<Person> list1, List<Person> list2) {
        return Stream.of(list1, list2)
                .flatMap(List::stream)
                .distinct()
                .toList();
    }
}
