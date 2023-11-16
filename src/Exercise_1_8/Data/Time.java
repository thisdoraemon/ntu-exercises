package Exercise_1_8.Data;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public Time nextSecond() {
        int newSecond = second + 1;
        int newMinute = minute;
        int newHour = hour;

        if (newSecond == 60) {
            newSecond = 0;
            newMinute++;
            if (newMinute == 60) {
                newMinute = 0;
                newHour++;
                if (newHour == 24) {
                    newHour = 0;
                }
            }
        }

        this.second = newSecond;
        this.minute = newMinute;
        this.hour = newHour;

        return this;
    }

    public Time previousSecond() {
        int newSecond = second - 1;
        int newMinute = minute;
        int newHour = hour;

        if (newSecond < 0) {
            newSecond = 59;
            newMinute--;
            if (newMinute < 0) {
                newMinute = 59;
                newHour--;
                if (newHour < 0) {
                    newHour = 23;
                }
            }
        }

        this.second = newSecond;
        this.minute = newMinute;
        this.hour = newHour;

        return this;
    }
}
