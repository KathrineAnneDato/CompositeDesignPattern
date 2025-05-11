import java.util.ArrayList;
import java.util.List;

public class College extends EducationalUnit {
    private List<EducationalUnit> units;

    public College(String name) {
        super(name);
        this.units = new ArrayList<>();
    }

    public void addUnit(EducationalUnit unit) {
        units.add(unit);
    }

    @Override
    public int getStudentCount() {
        int count = 0;
        for (EducationalUnit unit : units) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double budget = 0;
        for (EducationalUnit unit : units) {
            budget += unit.getBudget();
        }
        return budget;
    }

    @Override
    public void displayDetails() {
        System.out.println("College: " + name);
        for (EducationalUnit unit : units) {
            unit.displayDetails();
        }
    }
}
