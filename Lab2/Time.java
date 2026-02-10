package Lab2;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Invalid time!");
            hour = 0;
            minute = 0;
            second = 0;
        } else {
            hour = h;
            minute = m;
            second = s;
        }
    }

    public String toUniversal() {
        StringBuilder sb = new StringBuilder();

        if (hour < 10) sb.append("0");
        sb.append(hour).append(":"); // 05:

        if (minute < 10) sb.append("0");
        sb.append(minute).append(":");

        if (second < 10) sb.append("0");
        sb.append(second);

        return sb.toString();
    }

    public String toStandard() {
        StringBuilder sb = new StringBuilder();

        int standardHour = hour;
        String amPm = "AM";

        if (hour == 0) {
            standardHour = 12; // 00:xx -> 12 AM
        } else if (hour == 12) {
            standardHour = 12; // 12:xx -> 12 PM
            amPm = "PM";
        } else if (hour > 12) {
            standardHour = hour - 12;
            amPm = "PM";
        }

        if (standardHour < 10) sb.append("0");
        sb.append(standardHour).append(":");

        if (minute < 10) sb.append("0");
        sb.append(minute).append(":");

        if (second < 10) sb.append("0");
        sb.append(second);

        sb.append(" ").append(amPm);

        return sb.toString();
    }

    public Time add(Time other) {
        int newHour = this.hour + other.hour;
        int newMinute = this.minute + other.minute;
        int newSecond = this.second + other.second;

        if (newSecond >= 60) {
            newSecond -= 60;
            newMinute++;
        }

        if (newMinute >= 60) {
            newMinute -= 60;
            newHour++;
        }

        if (newHour >= 24) {
            newHour -= 24;
        }

        return new Time(newHour, newMinute, newSecond);
    }

    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal()); // 23:05:06
        System.out.println(t.toStandard());  // 11:05:06 PM

        Time t2 = new Time(4, 24, 33);

        Time sum = t.add(t2);
        System.out.println(sum.toUniversal()); // 03:29:39
        System.out.println(sum.toStandard());  // 03:29:39 AM
    }
}