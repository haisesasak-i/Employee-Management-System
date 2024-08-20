public class FullTimeEmployee extends Employee {
    private int monthsWorked;
    private double baseSalary;
    public FullTimeEmployee(String name, int id, String department,
                            int monthsWorked, double baseSalary) {
        super(name, id, department);
        this.baseSalary = baseSalary;

        this.monthsWorked = monthsWorked;
    }
    @Override
    public double calculateSalary() {

        return this.baseSalary * this.monthsWorked;
    }
    @Override
    public String toString() {
        return super.toString() + "for " + this.monthsWorked +
            " months with base Salary of $" + this.baseSalary + ".";
    }
}
