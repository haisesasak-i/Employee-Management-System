import java.util.Scanner;
public class EmployeeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement management = new EmployeeManagement();
        UserInterface userInterface = new UserInterface(scanner, management);
        userInterface.start();
    }
}
