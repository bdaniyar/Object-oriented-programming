package problem5;

class Time implements Comparable<Time> {

    private int hour, minute, second;

    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }
    @Override
    public int compareTo(Time o) {
        if (this.hour != o.hour)
            return this.hour - o.hour;

        if (this.minute != o.minute)
            return this.minute - o.minute;

        return this.second - o.second;
    }
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}