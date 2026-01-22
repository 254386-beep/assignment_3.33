import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        WorkoutDAO dao = new WorkoutDAO();

        while (true) {
            System.out.println("\n=== FITNESS TRACKER MENU ===");
            System.out.println("1. Add workout");
            System.out.println("2. View all workouts");
            System.out.println("3. Update workout duration");
            System.out.println("4. Delete workout");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            if (choice == 0) {
                System.out.println("Bye!");
                break;
            }

            switch (choice) {

                case 1 -> {
                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Duration (minutes): ");
                    int duration = scanner.nextInt();

                    System.out.print("Type (CARDIO / STRENGTH): ");
                    scanner.nextLine();
                    String type = scanner.nextLine().toUpperCase();

                    int calories = type.equals("CARDIO")
                            ? duration * 8
                            : duration * 5;

                    dao.saveWorkout(
                            new CardioWorkout(title, duration),
                            type,
                            1
                    );
                }

                case 2 -> {
                    System.out.println("\n--- WORKOUTS FROM DATABASE ---");
                    for (String w : dao.getAllFromDB()) {
                        System.out.println(w);
                    }
                }

                case 3 -> {
                    System.out.print("Workout ID: ");
                    int id = scanner.nextInt();

                    System.out.print("New duration: ");
                    int newDuration = scanner.nextInt();

                    dao.updateDurationById(id, newDuration);
                }

                case 4 -> {
                    System.out.print("Workout ID: ");
                    int id = scanner.nextInt();
                    dao.deleteWorkoutById(id);
                }

                default -> System.out.println("Invalid option");
            }
        }
    }
}
