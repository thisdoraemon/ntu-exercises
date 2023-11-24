package Exercise_3_4.App;

import Exercise_3_4.Data.MyTime;

public class MyTimeApp {
    public static void main(String[] args) {
        // Create an instance of MyTime
        MyTime myTime = new MyTime(12, 30, 45);

        // Display the initial time
        System.out.println("Initial Time: " + myTime);

        // Test nextSecond()
        myTime.nextSecond();
        System.out.println("After nextSecond(): " + myTime);

        // Test nextMinute()
        myTime.nextMinute();
        System.out.println("After nextMinute(): " + myTime);

        // Test nextHour()
        myTime.nextHour();
        System.out.println("After nextHour(): " + myTime);

        // Test previousSecond()
        myTime.previousSecond();
        System.out.println("After previousSecond(): " + myTime);

        // Test previousMinute()
        myTime.previousMinute();
        System.out.println("After previousMinute(): " + myTime);

        // Test previousHour()
        myTime.previousHour();
        System.out.println("After previousHour(): " + myTime);

        // Test setting new time
        myTime.setTime(23, 45, 30);
        System.out.println("After setTime(): " + myTime);
    }
}
