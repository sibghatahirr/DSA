import java.util.TreeMap;
import java.util.TreeSet;

    public class task3 {
        private TreeMap<String, TreeSet<String>> courses= new TreeMap<>();

        public void CourseEnrollmentManager() {
            courses = new TreeMap<>();
        }

        // Add student to course
        public void addStudentToCourse(String course,
                                       String studentName) {

            courses.putIfAbsent(course,
                    new TreeSet<>());

            courses.get(course).add(studentName);
        }

        // Remove student from course
        public void removeStudentFromCourse(String course,
                                            String studentName) {

            if (courses.containsKey(course)) {

                if (courses.get(course).remove(studentName)) {
                    System.out.println(studentName +
                            " removed from " + course);
                } else {
                    System.out.println(studentName +
                            " not found in " + course);
                }
            }
        }

        // Check enrollment
        public boolean isStudentEnrolled(String course,
                                         String studentName) {

            return courses.containsKey(course)
                    && courses.get(course)
                    .contains(studentName);
        }

        // Display course roster
        public void displayCourseRoster(String course) {

            if (!courses.containsKey(course)) {
                System.out.println("Course not found.");
                return;
            }

            System.out.println("Students enrolled in "
                    + course + ":");

            for (String student :
                    courses.get(course)) {

                System.out.println(student);
            }
        }
    }

