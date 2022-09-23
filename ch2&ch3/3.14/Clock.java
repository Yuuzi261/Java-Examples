public class Clock {

    public Clock() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour) {
        if(0 <= hour && hour <= 23) this.hour = hour;
        else this.hour = 0;
    }
    public void setMinute(int minute) {
        if(0 <= minute && minute <= 59) this.minute = minute;
        else this.minute = 0;
    }
    public void setSecond(int second) {
        if(0 <= second && second <= 59) this.second = second;
        else this.second = 0;
    }
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }
    public void displayTime() { System.out.printf("%d:%d:%d", hour, minute, second); }

    private int hour;
    private int minute;
    private int second;

}