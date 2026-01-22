import java.util.Objects;

public abstract class WorkoutRoutine {

    protected String title;
    protected int duration;   // minutes
    protected int calories;

    public WorkoutRoutine(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public abstract int calculateCalories();

    public int getCalories() {
        return calories;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    // OVERRIDE toString
    @Override
    public String toString() {
        return "Workout{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", calories=" + calories +
                '}';
    }

    // OVERRIDE equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkoutRoutine)) return false;
        WorkoutRoutine that = (WorkoutRoutine) o;
        return duration == that.duration &&
                Objects.equals(title, that.title);
    }

    // OVERRIDE hashCode
    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }
}
