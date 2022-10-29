import java.util.Comparator;

public class PersonsSurnameLengthComparator implements Comparator<Person> {
    protected int maxLength;

    public PersonsSurnameLengthComparator(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public int compare(Person o1, Person o2) {
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
    }
}