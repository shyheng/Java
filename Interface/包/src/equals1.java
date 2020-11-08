import java.util.Objects;

public class equals1 {
    private int year;
    private int month;
    private int day;

    public equals1() {
    }

    public equals1(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-"+ month + "-" +day + "-";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        equals1 equals1 = (equals1) o;
        return year == equals1.year &&
                month == equals1.month &&
                day == equals1.day;
    }


}
