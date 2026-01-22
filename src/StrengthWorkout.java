public class StrengthWorkout extends WorkoutRoutine {

    public StrengthWorkout(String title, int duration) {
        super(title, duration);
        this.calories = calculateCalories();
    }

    @Override
    public int calculateCalories() {
        return duration * 5;
    }
}
