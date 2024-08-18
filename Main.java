public class Main {
    public static void main(String[] args) {
        PartTimeEmployee employee =
            new PartTimeEmployee("ali", "1231231", "computer", 12.0, 13);
        System.out.println(employee);
        System.out.println("");
        System.out.println(employee.calculateSalary());
    }
}
