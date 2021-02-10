package dz6;

import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
public class Time {

    private int hour;
    private int min;


    public Time(int hour, int min) {

        setHour(hour);
        setMin(min);

    }


    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (0 > min || min > 59) {
            System.out.println("error");
        } else {
            this.min = min;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (0 > hour || hour > 24) {
            System.out.println("error");
        } else {
            this.hour = hour;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return min == time.min &&
                hour == time.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, hour);
    }

    @Override
    public String toString() {
        if (min < 10 && hour < 10) {
            return "Time{" + "0" + hour + ":"
                    + "0" + min +
                    '}';
        } else if (min >= 10 && hour < 10) {
            return "Time{" + "0" + hour + ":"
                    + min +
                    '}';

        } else if (min < 10 && hour >= 10) {
            return "Time{" + hour + ":"
                    + "0" + min +
                    '}';
        }
        return "Time{" + hour + ":"
                + min +
                '}';

    }
}
