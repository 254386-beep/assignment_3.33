import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FitnessApp {

    private List<WorkoutRoutine> workouts = new ArrayList<>();

    // ADD workout
    public void addWorkout(WorkoutRoutine workout) {
        workouts.add(workout);
    }

    // SEARCH by title
    public WorkoutRoutine findByTitle(String title) {
        for (WorkoutRoutine w : workouts) {
            if (w.getTitle().equalsIgnoreCase(title)) {
                return w;
            }
        }
        return null;
    }

    // FILTER by calories
    public List<WorkoutRoutine> filterByCalories(int minCalories) {
        List<WorkoutRoutine> result = new ArrayList<>();
        for (WorkoutRoutine w : workouts) {
            if (w.getCalories() >= minCalories) {
                result.add(w);
            }
        }
        return result;
    }

    // SORT by duration
    public void sortByDuration() {
        workouts.sort(Comparator.comparingInt(WorkoutRoutine::getDuration));
    }

    public void printAll() {
        for (WorkoutRoutine w : workouts) {
            System.out.println(w);
        }
    }
}
