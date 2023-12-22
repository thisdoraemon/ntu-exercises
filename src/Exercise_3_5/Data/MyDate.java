package Exercise_3_5.Data;

public class MyDate {
    private int year;
    private int month;
    private int day;

    private String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    private String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };

    private int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        int maxDaysInMonth = 31;

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDaysInMonth = 30;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                maxDaysInMonth = 29;
            } else {
                maxDaysInMonth = 28;
            }
        }

        return day <= maxDaysInMonth;
    }

    public int getDayOfWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            year--;
        }

        int k = year % 100;
        int j = year / 100;

        int dayOfWeek = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j)) % 7;

        dayOfWeek = (dayOfWeek + 7) % 7;

        return dayOfWeek;
    }

    public MyDate(int year, int month, int day) {}

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        int maxDaysInMonth = DAYS_IN_MONTHS[month - 1];

        if (isLeapYear(year) && month == 2) {
            maxDaysInMonth = 29;
        }

        if (day < maxDaysInMonth) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }

        return this;
    }

    public MyDate nextMonth() {
        if (month < 12) {
            month++;
        } else {
            month = 1;
            year++;
        }

        int maxDaysInMonth = DAYS_IN_MONTHS[month - 1];

        if (isLeapYear(year) && month == 2) {
            maxDaysInMonth = 29;
        }

        if (day > maxDaysInMonth) {
            day = maxDaysInMonth;
        }

        return this;
    }

    public MyDate nextYear() {
        if (year < 9999) {
            year++;
        } else {
            throw new IllegalStateException("Year out of range!");
        }

        int maxDaysInMonth = DAYS_IN_MONTHS[month - 1];

        if (isLeapYear(year) && month == 2) {
            maxDaysInMonth = 29;
        }

        if (day > maxDaysInMonth) {
            day = maxDaysInMonth;
        }

        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else {
            if (month > 1) {
                month--;
                day = DAYS_IN_MONTHS[month - 1];

                if (isLeapYear(year) && month == 2) {
                    day++;
                }
            } else {
                month = 12;
                day = 31;
                year--;
            }
        }

        return this;
    }

    public MyDate previousMonth() {
        if (month > 1) {
            month--;

            int maxDaysInMonth = DAYS_IN_MONTHS[month - 1];

            if (isLeapYear(year) && month == 2) {
                maxDaysInMonth = 29;
            }

            if (day > maxDaysInMonth) {
                day = maxDaysInMonth;
            }
        } else {
            month = 12;
            year--;

            int maxDaysInMonth = DAYS_IN_MONTHS[month - 1];

            if (isLeapYear(year) && month == 2) {
                maxDaysInMonth = 29;
            }

            if (day > maxDaysInMonth) {
                day = maxDaysInMonth;
            }
        }

        return this;
    }

    public MyDate previousYear() {
        if (year > 1) {
            year--;

            int maxDaysInMonth = DAYS_IN_MONTHS[month - 1];

            if (isLeapYear(year) && month == 2) {
                maxDaysInMonth = 29;
            }

            if (day > maxDaysInMonth) {
                day = maxDaysInMonth;
            }
        } else {
            throw new IllegalStateException("Year out of range!");
        }

        return this;
    }

}
