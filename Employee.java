public abstract class Employee {
    private String name;
    private String id;
    private String department;

    public Employee(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    public abstract double calculateSalary();
    public String getDetails() {
        return "Employee: " + this.name + "has id"
            + "\"" + this.id + "and works in " + this.department + "department";
    }
}