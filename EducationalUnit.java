public abstract class EducationalUnit {
    protected String name;

    public EducationalUnit(String name) {
        this.name = name;
    }

    public abstract int getStudentCount();
    public abstract double getBudget();
    public abstract void displayDetails();
}
