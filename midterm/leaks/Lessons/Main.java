package midterm.leaks.Lessons;

public class Main {
    public static void main(String[] args){
        Time time = new Time(14,30);
        Lesson oop = new Lesson(Days.MONDAY, time);
        oop.printLesson();
    }
}
