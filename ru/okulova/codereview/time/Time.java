package CodeReview4.ru.okulova.codereview.time;

public class Time {
    private int time;
    private int originalTime;

    public Time() {
        this.time = 0;
    }

    public Time(int time) {
        setTime(time);
    }

    public void setTime(int time) {
        this.originalTime = time;
        this.time = (time%86400 + 86400)%86400;
    }

    private int getHours() {
        return time/3600;
    }

    private int getMinutes() {
        return (time%3600)/60;
    }

    private int getSeconds() {
        return time%60;
    }

    @Override
    public String toString() {
        return "Время для " + originalTime + " секунд : "
                + getHours() + " : " + getMinutes() + " : "
                + getSeconds() + " ";
    }
}