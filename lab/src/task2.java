import java.util.TreeMap;
import java.util.Map;

public class task2 {
        private TreeMap<String, Integer> studentScores =new TreeMap<>();

        public void StudentScoreManager() {
            studentScores = new TreeMap<>();
        }

        // Add or update score
        public void addOrUpdateScore(String name, int score) {
            studentScores.put(name, score);
        }

        // Remove student
        public void removeStudent(String name) {
            if (studentScores.remove(name) != null) {
                System.out.println(name + " removed successfully.");
            } else {
                System.out.println(name + " not found.");
            }
        }

        // Get score
        public Integer getScore(String name) {
            return studentScores.get(name);
        }

        // Display all students
        public void displayAllStudents() {
            System.out.println("Student Records:");

            for (Map.Entry<String, Integer> entry :
                    studentScores.entrySet()) {

                System.out.println(
                        entry.getKey() + " : " + entry.getValue()
                );
            }
        }

        // Display students in alphabetical range
        public void displayStudentsInRange(String start, String end) {

            System.out.println("Students between " +
                    start + " and " + end + ":");

            for (Map.Entry<String, Integer> entry :
                    studentScores.subMap(start, end).entrySet()) {

                System.out.println(
                        entry.getKey() + " : " + entry.getValue()
                );
            }
        }
    }

