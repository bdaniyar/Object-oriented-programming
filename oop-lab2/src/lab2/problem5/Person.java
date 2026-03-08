package lab2.problem5;

import java.util.Objects;

public abstract class Person {

    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet){

        if(this.pet != null){
            System.out.println(name + " already has a pet.");
            return;
        }

        this.pet = pet;
    }

    public void removePet(){
        this.pet = null;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void leavePetWith(Person other){

        if(!hasPet()){
            System.out.println(name + " has no pet.");
            return;
        }

        if(other.hasPet()){
            System.out.println(other.name + " already has a pet.");
            return;
        }

        if(other instanceof PhDStudent && pet instanceof Dog){
            System.out.println("PhDStudent cannot take care of dogs.");
            return;
        }

        other.assignPet(pet);
        removePet();
    }

    public void retrievePetFrom(Person other){

        if(!other.hasPet()){
            System.out.println(other.name + " has no pet.");
            return;
        }

        assignPet(other.pet);
        other.removePet();
    }

    public abstract String getOccupation();

    @Override
    public String toString(){

        String petInfo = (pet == null) ? "No pet" : pet.toString();

        return name + " (" + getOccupation() + ") - Pet: " + petInfo;
    }

    @Override
    public boolean equals(Object o){

        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }
}