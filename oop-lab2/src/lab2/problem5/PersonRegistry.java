package lab2.problem5;

import java.util.ArrayList;

public class PersonRegistry {

    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person p){
        people.add(p);
    }

    public void removePerson(Person p){
        people.remove(p);
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();

        for(Person p : people){
            sb.append(p).append("\n");
        }

        return sb.toString();
    }
}