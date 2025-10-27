package session6.D_List.exercise;

import java.util.Comparator;

public class PersonNameCompartor implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}
