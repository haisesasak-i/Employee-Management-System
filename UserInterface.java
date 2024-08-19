import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private EmployeeManagement management;
    public UserInterface(Scanner scanner, EmployeeManagement management) {
        this.scanner = scanner;
        this.management = management;
    }
    public void start() {
        int choice;
        System.out.println(
            "<------------------------- Employee Manager ----------------------->");
        while (true) {
            System.out.println("");
            System.out.println(
                "What would you like to do?\nEnter \"1\" to add a Full-Time or Part-Time employee.\nEnter \"2\" to view details of an employee using Id.\nEnter \"3\" to remove an employee.\nEnter \"4\" to view all employee.\nEnter \"5\" to quit.");
            choice = Integer.valueOf(this.scanner.nextLine());
            if (choice > 0 && choice <= 5) {
                break;
            }
        }
    }
}
