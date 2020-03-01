package facadeExcerciseUser;

// Zadanie: stworzyc klase Nadrzędną User/Person, później dwie klasy które dziedziczą - klasa student (z polami firsName, lastName i course),
// klasa teacher z polami firstName, lastName oraz List<String> block
// Następnie użyć facade add person

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonFacade personFacade = new PersonFacade();

        List<Person> personList = new LinkedList<>();

        List<String> blocks = new LinkedList<>();
        blocks.add("wzorce");
        blocks.add("spring");

        personList.add(personFacade.addStudent("Jan", "Kowalski", "java"));

        personList.add(personFacade.addTeacher("Piotr", "Nowak", blocks));

        System.out.println(personList);

    }
}
