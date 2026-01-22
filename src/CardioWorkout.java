public class CardioWorkout extends WorkoutRoutine {

    public CardioWorkout(String title, int duration) {
        super(title, duration);
        this.calories = calculateCalories();
    }

    @Override
    public int calculateCalories() {
        return duration * 8; // cardio burns more calories
    }
}
