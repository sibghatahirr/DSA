public class Main {
    public static void main(String[] args) {

        task3 manager =
                new task3();

        manager.addStudentToCourse("OOP", "Hamza");
        manager.addStudentToCourse("OOP", "Ali");
        manager.addStudentToCourse("OOP", "Zain");

        manager.addStudentToCourse("DSA", "Basit");
        manager.addStudentToCourse("DSA", "Kiran");

        manager.displayCourseRoster("OOP");

        System.out.println("\nAli enrolled in OOP? "
                + manager.isStudentEnrolled(
                "OOP", "Ali"));

        manager.removeStudentFromCourse(
                "OOP", "Ali");

        System.out.println();

        manager.displayCourseRoster("OOP");
    }
}