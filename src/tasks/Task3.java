package tasks;

import model.Person;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void groupByTitleAndModify(List<Person> people) {
        Map<String, List<Person>> titlesGroup = people
                .stream()
                .collect(Collectors.groupingBy(Person::getTitle));

        titlesGroup.forEach(
                (key, value) -> System.out.printf("Group: %s, Count: %s%n", key, value.size()));

        titlesGroup.getOrDefault("Mr", Collections.emptyList())
                .forEach(person -> person.setName(String.format("pan %s", person.getName())));
    }
}
