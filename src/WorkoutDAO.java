import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorkoutDAO {

    // ================= CREATE =================
    public void saveWorkout(WorkoutRoutine workout, String type, int userId) {

        String sql = "INSERT INTO workout_routines " +
                "(title, duration, calories, type, user_id) VALUES (?, ?, ?, ?, ?)";

        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, workout.getTitle());
            ps.setInt(2, workout.getDuration());
            ps.setInt(3, workout.getCalories());
            ps.setString(4, type);
            ps.setInt(5, userId);

            ps.executeUpdate();
            System.out.println("Workout added to database.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ================= READ =================
    public List<String> getAllFromDB() {

        List<String> list = new ArrayList<>();
        String sql = "SELECT * FROM workout_routines ORDER BY id";

        try (Connection c = DatabaseConnection.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(
                        rs.getInt("id") + " | " +
                                rs.getString("title") + " | " +
                                rs.getInt("duration") + " | " +
                                rs.getInt("calories") + " | " +
                                rs.getString("type")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    // ================= UPDATE =================
    public void updateDurationById(int id, int newDuration) {

        String sql = "UPDATE workout_routines SET duration = ?, calories = ? WHERE id = ?";

        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            int newCalories = newDuration * 5; // default
            ps.setInt(1, newDuration);
            ps.setInt(2, newCalories);
            ps.setInt(3, id);

            ps.executeUpdate();
            System.out.println("Workout updated.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ================= DELETE =================
    public void deleteWorkoutById(int id) {

        String sql = "DELETE FROM workout_routines WHERE id = ?";

        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Workout deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
