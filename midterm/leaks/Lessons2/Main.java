package midterm.leaks.Lessons2;

public class Main {
    public static void main(String[] args){
        Time time = new Time(15,36);
        Lessons oop = new Lessons(Days.MONDAY, time);

        oop.printLesson();
    }
}
