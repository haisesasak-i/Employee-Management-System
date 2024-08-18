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
    public void removeAnEmployee(Employee employee) {
        if (!this.employeeIdTOEmployeeMap.containsKey(employee.getId())) {
            System.out.println(
                "The given id cannot be found in employee list.");
            return;
        }
        this.employeeIdTOEmployeeMap.remove(employee.getId());
        System.out.println("The employee " + employee.getName() +
                           " is removed successfully!");
    }
    public void displayDetailsById(Employee employee) {
        if (!this.employeeIdTOEmployeeMap.containsKey(employee.getId())) {
            System.out.println(
                "The given id cannot be found in employee list.");
            return;
        }
        System.out.println(this.employeeIdTOEmployeeMap.get(employee.getId()));
    }
}