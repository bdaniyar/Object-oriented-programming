package midterm.leaks.Lessons;

public class Lesson {
    private Days days;
    private Time time;

    public Lesson(Days days, Time time){
        this.days = days;
        this.time = time;
    }

    public void printLesson(){
        System.out.println(days + " " + time);
    }
}
