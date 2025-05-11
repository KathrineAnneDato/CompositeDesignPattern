public class UniversitySystem {
    public static void main(String[] args) {
        College engineering = new College("College of Informatics");

        Department csDept = new Department("Department of Computer Science");

        Teacher teacher1 = new Teacher("Prof. Eric", "Mathematics", 30000);
        Teacher teacher2 = new Teacher("Dr. Megan", "Computer System", 50000);

        Student student1 = new Student("Miya", "S19315", 15000);
        Student student2 = new Student("Odette", "S60890", 15000);

        csDept.addTeacher(teacher1);
        csDept.addTeacher(teacher2);
        csDept.addStudent(student1);
        csDept.addStudent(student2);

        engineering.addUnit(csDept);

        engineering.displayDetails();
        System.out.println("Total Students: " + engineering.getStudentCount());
        System.out.println("Total Budget: $" + engineering.getBudget());
    }
}
