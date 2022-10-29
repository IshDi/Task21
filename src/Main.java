import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Игорь", "Петров-Шульман-Аравийский-Мордонов", 12));
        people.add(new Person("Савелий", "Иванов-Девальват-Маркиз", 25));
        people.add(new Person("Ирина", "Ее Величество Антуанетта", 8));
        people.add(new Person("Мария", "Амиранова-Егорова", 42));
        people.add(new Person("Иван", "Орионов Герцог Визовский", 36));
        people.add(new Person("Сергей", "Просто Петров", 15));
        people.add(new Person("Дарья", "Сорокина", 23));
        System.out.println(people);
        Collections.sort(people, new PersonsSurnameLengthComparator(3));
        System.out.println(people);
    }
}
