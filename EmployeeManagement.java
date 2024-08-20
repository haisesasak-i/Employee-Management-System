import java.util.HashMap;
public class EmployeeManagement {
    private HashMap<Integer, Employee> employeeIdTOEmployeeMap;
    public EmployeeManagement() {
        this.employeeIdTOEmployeeMap = new HashMap<>();
    }
    public void addAnEmployee(Employee employee) {
        if (employeeIdTOEmployeeMap.containsKey(employee.getId())) {
            System.out.println("The employee " + employee.getName() +
                               " is already added.");
            return;
        }
        employeeIdTOEmployeeMap.put(employee.getId(), employee);
    }
    public void displayAllEmployee() {
        for (Employee currentEmployee : this.employeeIdTOEmployeeMap.values()) {
            System.out.println(currentEmployee);
        }
    }
    public void removeAnEmployee(int id) {
        if (!this.employeeIdTOEmployeeMap.containsKey(id)) {
            System.out.println(
                "The given id cannot be found in employee list.");
            return;
        }
        this.employeeIdTOEmployeeMap.remove(id);
        System.out.println("The employee with id " + id +
                           " is removed successfully!");
    }
    public void displayDetailsById(int id) {
        if (!this.employeeIdTOEmployeeMap.containsKey(id)) {
            System.out.println(
                "The given id cannot be found in employee list.");
            return;
        }
        System.out.println(this.employeeIdTOEmployeeMap.get(id));
    }
    public void calculateSalary(int employeeId) {
        if (!this.employeeIdTOEmployeeMap.containsKey(employeeId)) {
            System.out.println(
                "The given id cannot be found in employee list.");
            return;
        }
        System.out.println(" ");
        System.out.println(
            "The salary of employee " +
            this.employeeIdTOEmployeeMap.get(employeeId).getName() +
            "with id " + this.employeeIdTOEmployeeMap.get(employeeId).getId() +
            " is $" +
            this.employeeIdTOEmployeeMap.get(employeeId).calculateSalary() +
            ".");
    }
}