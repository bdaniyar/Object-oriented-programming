package midterm.leaks.Lessons2;

public class Lessons {
    private Days days;
    private Time time;

    public Lessons(Days days, Time time){
        this.days = days;
        this.time = time;
    }

    public void printLesson(){
        System.out.println(days + " " + time);
    }

}
