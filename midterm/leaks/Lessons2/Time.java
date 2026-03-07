package midterm.leaks.Lessons2;

public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString(){
        return hour + " " + minute;
    }
}
