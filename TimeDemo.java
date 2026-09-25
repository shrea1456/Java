//Time Addition with Overflow Handling

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to add two Time objects
    public static Time addTime(Time t1, Time t2) {
        int totalSeconds = t1.seconds + t2.seconds;
        int carryMinutes = totalSeconds / 60;
        int finalSeconds = totalSeconds % 60;

        int totalMinutes = t1.minutes + t2.minutes + carryMinutes;
        int carryHours = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        int finalHours = t1.hours + t2.hours + carryHours;

        return new Time(finalHours, finalMinutes, finalSeconds);
    }

    public void display() {
        System.out.printf("%02d hrs : %02d mins : %02d secs\n", hours, minutes, seconds);
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time(3, 45, 50);
        Time t2 = new Time(2, 30, 25);

        System.out.print("Duration 1: ");
        t1.display();

        System.out.print("Duration 2: ");
        t2.display();

        Time total = Time.addTime(t1, t2);
        System.out.print("Total Duration: ");
        total.display();
    }
}