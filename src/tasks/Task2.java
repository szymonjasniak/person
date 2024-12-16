package tasks;

import model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    private static final String DELIMITER = ", ";
    private static final String NO_PEOPLE_IN_THE_LIST = "No people in the list";

    public static String getThreeOldest(List<Person> people) {
        if (people == null || people.isEmpty()) {
            return NO_PEOPLE_IN_THE_LIST;
        }
        return people.stream()
                .filter(person -> person.getAge().isPresent())
                .sorted(Comparator.comparing(person -> person.getAge().get(), Comparator.reverseOrder()))
                .limit(3)
                .map(Task2::formatPerson)
                .collect(Collectors.joining(DELIMITER));
    }

    private static String formatPerson(Person person) {
        return String.format("%s %s %s", person.getTitle(), person.getName(), person.getAge().map(Object::toString).orElseThrow());
    }

}
