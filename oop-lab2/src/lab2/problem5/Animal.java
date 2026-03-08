package lab2.problem5;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return name + " (" + getClass().getSimpleName() + ")";
    }
}