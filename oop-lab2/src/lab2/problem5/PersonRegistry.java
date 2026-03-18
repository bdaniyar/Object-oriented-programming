package lab2.problem5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {

    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person p) {
        people.add(p);
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public List<Person> getWithPet() {
        List<Person> filtered = new ArrayList<Person>();

        for (Person p : this.people) {
            if (p.hasPet()) {
                filtered.add(p);
            }
        }
        return filtered;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (Person p : people) {
            sb.append(p).append("\n");
        }

        return sb.toString();
    }
}