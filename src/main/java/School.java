import java.util.Scanner;

public class School {

    public static void main(String[] args) {
        String grades = "ABCDEF";
        String groups = "12345";
        String studentName;
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to the Mathematics class grades tracking app ");
            System.out.println("To add a student enter 1 ");
            System.out.println("To retrieve all student names/grades/groups enter 2 ");
            System.out.println("To retrieve a student's grade enter 3 ");
            System.out.println("To upgrade or downgrade a student's grade enter 4 ");
            System.out.println("To exit programme enter exit ");
            System.out.print("Enter choice : ");
            String choice = scanner.next();

            switch (choice) {
                case "1" -> {
                    System.out.print("Enter student name: ");
                    studentName = scanner.next();
                    studentName += scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    String studentGrade = scanner.next();
                    while (!grades.contains(studentGrade)) {
                        System.out.print("Please enter A, B, C, D, E, or F : ");
                        studentGrade = scanner.next();
                    }
                    System.out.print("Enter student group: ");
                    String studentGroup = scanner.next();
                    while (!groups.contains(studentGroup)) {
                        System.out.print("Please enter 1, 2, 3, 4, or 5 : ");
                        studentGroup = scanner.next();
                    }
                    Student student = new Student(studentName, studentGrade, studentGroup);
                    Student.addStudentToList(student);
                }
                case "2" -> System.out.println(Student.getStudentDetails());
                case "3" -> {
                    System.out.print("Enter student name: ");
                    studentName = scanner.next();
                    studentName += scanner.nextLine();
                    System.out.println(Student.getStudentGrade(studentName));
                }
                case "4" -> {
                    System.out.print("Enter student name: ");
                    studentName = scanner.next();
                    studentName += scanner.nextLine();
                    System.out.print("Enter upgrade or downgrade: ");
                    String grade = scanner.next();
                    Student.setGrade(studentName, grade);
                }
                case "exit" -> {
                    System.out.println("Goodbye");
                    exit = true;
                }
                default -> {
                }
            }
        }
        scanner.close();
    }
}
