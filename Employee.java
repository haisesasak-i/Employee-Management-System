public abstract class Employee {
    private String name;
    private int id;
    private String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    public abstract double calculateSalary();
    @Override
    public String toString() {
        return "Employee: " + this.name + " has id "
            + "\"" + this.id + "\" and has been working in " + this.department +
            " department ";
    }
    public String getName() { return this.name; }
    public int getId() { return this.id; }
    public String getDepartment() { return this.department; }
}