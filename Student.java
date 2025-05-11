public class Student extends EducationalUnit {
    private String studentID;
    private double tuitionFee;

    public Student(String name, String studentID, double tuitionFee) {
        super(name);
        this.studentID = studentID;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return tuitionFee; 
    }

    @Override
    public void displayDetails() {
        System.out.println("Student: " + name + ", ID: " + studentID + ", Tuition Fee: $" + tuitionFee);
    }
}
