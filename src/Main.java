import java.util.Comparator;
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

        Comparator<Person> comparator = (o1, o2) -> {
            int maxLength = 3;
            int lengthSurnameo1 = o1.getSurname().split("[ -]+").length;
            int lengthSurnameo2 = o2.getSurname().split("[ -]+").length;
            if (lengthSurnameo1 > maxLength) {
                lengthSurnameo1 = maxLength;
            }
            if (lengthSurnameo2 > maxLength) {
                lengthSurnameo2 = maxLength;
            }
            if (lengthSurnameo1 == lengthSurnameo2) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
            return Integer.compare(lengthSurnameo2, lengthSurnameo1);
        };
        Collections.sort(people, comparator);
        System.out.println(people);
    }
}
