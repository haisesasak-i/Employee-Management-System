public class Main {
    public static void main(String[] args) {
        Employee ali = new PartTimeEmployee("ali", 12345, "computer", 13.0, 12);
        Employee aqib =
            new FullTimeEmployee("ali", 123456, "computer", 12, 1200.0);
        EmployeeManagement management = new EmployeeManagement();
        management.addAnEmployee(ali);
        management.removeAnEmployee(aqib);
        management.addAnEmployee(aqib);
        management.removeAnEmployee(aqib);
        management.displayAllEmployee();
    }
}
