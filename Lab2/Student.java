package Lab2;

public class Student {
    private String name;
    private int id;
    private int yearOfStudy;

    public Student(String name, int id ){
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void incrementYear() {
       yearOfStudy++;
    }
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    public static void main(String[] args){
        Student s1 = new Student("Daniyar", 101);
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s1.getYearOfStudy());

        s1.incrementYear();
        System.out.println(s1.getYearOfStudy());
    }
}
