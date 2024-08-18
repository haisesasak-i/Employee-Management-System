public class Main {
    public static void main(String[] args) {
        FullTimeEmployee employee =
            new FullTimeEmployee("ali", "1231231", "computer", 12, 1200.0);
        System.out.println(employee);
        System.out.println("");
        System.out.println(employee.calculateSalary());
    }
}
