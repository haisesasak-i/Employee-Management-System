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
        while (true) {
            while (true) {
                System.out.println(
                    "<------------------------- Employee Manager ----------------------->");

                System.out.println("");
                System.out.println(
                    "What would you like to do?\nEnter \"1\" to add a Full-Time or Part-Time employee.\nEnter \"2\" to view details of an employee using Id.\nEnter \"3\" to remove an employee.\nEnter \"4\" to view all employee.\nEnter \"5\" to calculate salary of an employee.\nEnter \"6\" to quit.");
                choice = Integer.valueOf(this.scanner.nextLine());
                if (choice > 0 && choice <= 6) {
                    break;
                }
                System.out.println(" ");
                System.out.println(
                    "You have entered an invalid number\nRemember the number must be from 1 till 6.");
            }
            System.out.println(" ");
            if (choice == 1) {
                this.addingAFullTimeOrPartTimeEmployee();
            } else if (choice == 2) {
                this.displayingDetailsOfEmployeeUsingId();
            } else if (choice == 3) {
                this.removeAnEmployeeUsingId();
            } else if (choice == 4) {
                displayAllEmployee();
            } else if (choice == 5) {

                this.calculateSalary();
            } else {
                System.out.println(" ");
                System.out.println(
                    "Thanks! for using our employee manager\nMay you have an amazing day!");
                return;
            }
            System.out.println("");
            System.out.println(
                "Would you like to continue using our employee Manager:\n\nEnter any variation of \"true\" like \"True or TrUe\" to continue using our employee manager.\nAnything other than variation of \"true\" will be considered \"false\".");
            boolean userChoice = Boolean.valueOf(scanner.nextLine());
            if (!userChoice) {
                System.out.println(
                    "Thanks! for using our employee manager\nMay you have an amazing day!");
                break;
            }
        }
    }
    public void addingAFullTimeOrPartTimeEmployee() {
        Employee employee = null;
        int choice;
        while (true) {
            System.out.println(
                "Which employee would you like to add?\nEnter \"1\" to add a full time employee.\nEnter \"2\" to add a part time employee.");
            choice = Integer.valueOf(this.scanner.nextLine());

            switch (choice) {
            case 1: {
                employee = this.creationOfFullTimeEmployee();
                break;
            }
            case 2: {
                employee = this.creationOfPartTimeEmployee();
                break;
            }
            default: {
                System.out.println(" ");
                System.out.println(
                    "Kindly try again\nEnter either \"1\" or \"2\".");
                System.out.println(" ");
            }
            }
            if (choice == 1 || choice == 2) {
                break;
            }
        }
        this.management.addAnEmployee(employee);
    }
    private Employee creationOfFullTimeEmployee() {
        int id;
        int monthsWorked;
        double baseSalary;

        System.out.println("Enter the name of employee:");
        String name = this.scanner.nextLine();
        while (true) {
            System.out.println("Enter the id of employee:");
            id = Integer.valueOf(scanner.nextLine());
            if (id > 0) {
                break;
            }
            System.out.println(" ");
            System.out.println("id can never be negative\n Try Again!");
        }

        System.out.println("Enter the department of employee:");
        String department = this.scanner.nextLine();

        while (true) {
            System.out.println("Enter the number of months " + name +
                               " worked:");
            monthsWorked = Integer.valueOf(this.scanner.nextLine());
            if (monthsWorked >= 0 && monthsWorked <= 12) {
                break;
            } else
                System.out.println(" ");
            System.out.println(
                "There are only 12 months your months input is invalid!");
            System.out.println(" ");
        }
        while (true) {
            System.out.println("Enter the base salary of " + name + ":");
            baseSalary = Double.valueOf(this.scanner.nextLine());
            if (baseSalary >= 0.0) {
                break;
            }
            System.out.println(" ");
            System.out.println("Base salary can never be negative");
            System.out.println(" ");
        }
        Employee fulltimeEmployee = new FullTimeEmployee(
            name, id, department, monthsWorked, baseSalary);

        return fulltimeEmployee;
    }
    private Employee creationOfPartTimeEmployee() {
        int hours;
        int id;
        double hourlyRate;
        System.out.println(" ");
        System.out.println("Enter the name of employee:");
        String name = this.scanner.nextLine();
        while (true) {
            System.out.println("Enter the id of employee:");
            id = Integer.valueOf(scanner.nextLine());
            if (id > 0) {
                break;
            }
            System.out.println(" ");
            System.out.println("id can never be negative\n Try Again!");
        }

        System.out.println("Enter the department of employee:");
        String department = this.scanner.nextLine();
        while (true) {
            System.out.println("Enter the number of hours " + name +
                               " worked:");
            hours = Integer.valueOf(this.scanner.nextLine());
            if (hours >= 0 && hours <= 24) {
                break;
            } else
                System.out.println(" ");
            System.out.println(
                "There are only 24 hours your hours input is invalid!");
            System.out.println(" ");
        }
        while (true) {
            System.out.println("Enter the hourly rate of " + name + ":");
            hourlyRate = Double.valueOf(this.scanner.nextLine());
            if (hourlyRate >= 0.0) {
                break;
            }
            System.out.println(" ");
            System.out.println("Hourly rate can never be negative");
            System.out.println(" ");
        }
        Employee partTimeEmployee =
            new PartTimeEmployee(name, id, department, hourlyRate, hours);
        return partTimeEmployee;
    }
    private void displayAllEmployee() { this.management.displayAllEmployee(); }
    private void removeAnEmployeeUsingId() {
        int id = this.gettingIdOfUser();
        this.management.removeAnEmployee(id);
    }
    private void displayingDetailsOfEmployeeUsingId() {
        int id = this.gettingIdOfUser();
        this.management.displayDetailsById(id);
    }
    private int gettingIdOfUser() {

        System.out.println("Enter the id of employee to remove:");
        int id = Integer.valueOf(scanner.nextLine());
        return id;
    }
    private void calculateSalary() {
        this.management.calculateSalary(gettingIdOfUser());
    }
}
