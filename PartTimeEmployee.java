public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(String name, int id, String department,
                            double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;

        this.hoursWorked = hoursWorked;
    }
    @Override
    public String toString() {
        return super.toString() + "as part time with hourly rate of $" +
            this.hourlyRate + " and total worked hours of " + super.getName() +
            " are " + this.hoursWorked + " hours.";
    }
    @Override
    public double calculateSalary() {
        return this.hourlyRate * this.hoursWorked;
    }
}
