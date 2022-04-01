import java.util.ArrayList;
import java.util.Objects;

public class Student {

    protected String name;
    protected String grade;
    protected String group;
    private static final String NICKNAME = "mySecretNickName";

    static ArrayList<String> studentNames = new ArrayList<>();
    static ArrayList<String> studentGrades = new ArrayList<>();
    static ArrayList<String> studentGroups = new ArrayList<>();
    private final static ArrayList<String> STUDENTNICKNAMES = new ArrayList<>();

    static ArrayList<Object> outerArrayList = new ArrayList<>();

    public Student(String name, String grade, String group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public static void addStudentToList(Student student) {

        studentNames.add(student.name);
        studentGrades.add(student.grade);
        studentGroups.add(student.group);
        STUDENTNICKNAMES.add(NICKNAME);

        outerArrayList.add(studentNames);
        outerArrayList.add(studentGrades);
        outerArrayList.add(studentGroups);
        outerArrayList.add(STUDENTNICKNAMES);

    }

    public static ArrayList<Object> getStudentDetails() {
        ArrayList<Object> studentDetailsArrayList = new ArrayList<>();
        for (int i = 0; i < studentNames.size(); i++) {
            studentDetailsArrayList.add(studentNames.get(i));
            studentDetailsArrayList.add(studentGrades.get(i));
            studentDetailsArrayList.add(studentGroups.get(i));
        }
        return studentDetailsArrayList;
    }

    public static String getStudentGrade(String studentName) {

        for (int i = 0; i < studentNames.size(); i++) {

            for (int j = 0; j < studentNames.size(); j++) {
                if (Objects.equals(studentNames.get(j), studentName)) {
                    return studentName + " grade = " + studentGrades.get(j);
                }
            }
        }
        return studentName + " Can't be found";
    }

    public static void setGrade(String studentName, String grade) {
        String currentGrade;
        for (int j = 0; j < studentNames.size(); j++) {
            if (Objects.equals(studentNames.get(j), studentName)) {
                currentGrade = studentGrades.get(j);
                if (Objects.equals(grade, "upgrade")) {
                    if (Objects.equals(currentGrade, "F")) studentGrades.set(j, "E");
                    else if (Objects.equals(currentGrade, "E")) studentGrades.set(j, "D");
                    else if (Objects.equals(currentGrade, "D")) studentGrades.set(j, "C");
                    else if (Objects.equals(currentGrade, "C")) studentGrades.set(j, "B");
                    else if (Objects.equals(currentGrade, "B")) studentGrades.set(j, "A");
                    else if (Objects.equals(currentGrade, "A")) studentGrades.set(j, "A");
                }
                if (Objects.equals(grade, "downgrade")) {
                    if (Objects.equals(currentGrade, "A")) studentGrades.set(j, "B");
                    else if (Objects.equals(currentGrade, "B")) studentGrades.set(j, "C");
                    else if (Objects.equals(currentGrade, "C")) studentGrades.set(j, "D");
                    else if (Objects.equals(currentGrade, "D")) studentGrades.set(j, "E");
                    else if (Objects.equals(currentGrade, "E")) studentGrades.set(j, "F");
                    else if (Objects.equals(currentGrade, "F")) studentGrades.set(j, "F");
                }
            }
        }
    }
}







