public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        // Adjust the values if they are out of range
        if (hour > 23 || minute > 59 || second > 59) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    public void setHour(int hour) {
        // Only set the hour if it is in the valid range
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        // Only set the minute if it is in the valid range
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        // Only set the second if it is in the valid range
        if (second >= 0 && second <= 59) {
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }
}
