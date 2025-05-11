import java.util.ArrayList;
import java.util.List;

public class Department extends EducationalUnit {
    private List<Teacher> teachers;
    private List<Student> students;

    public Department(String name) {
        super(name);
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public int getStudentCount() {
        return students.size();
    }

    @Override
    public double getBudget() {
        double budget = 0;
        for (Teacher teacher : teachers) {
            budget += teacher.getBudget();
        }
        for (Student student : students) {
            budget -= student.getBudget(); // Tuition fee is subtracted
        }
        return budget;
    }

    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        for (Teacher teacher : teachers) {
            teacher.displayDetails();
        }
        for (Student student : students) {
            student.displayDetails();
        }
    }
}
