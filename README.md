# Employee-Management-System

This Java project is an Employee Management System that allows you to manage employees in an organization. The system supports different types of employees, including full-time and part-time, and provides functionalities such as adding, viewing, and calculating salaries for these employees.

## Features

- **Object-Oriented Design:** The project is designed using Object-Oriented Programming principles, making it modular, scalable, and easy to maintain.
- **Employee Types:** Supports both full-time and part-time employees with different salary calculation methods.
- **Interactive User Interface:** A simple text-based interface that allows users to interact with the system to add, view, and manage employees.
- **Error Handling:** Validates user input and handles common errors like invalid data entries.

## Class Structure

### `Employee`

- **Abstract class** representing a general employee.
- Contains common attributes such as `id`, `name`, and `basicSalary`.
- Abstract method `calculateSalary()` that is overridden by subclasses.

### `FullTimeEmployee`

- **Subclass** of `Employee`.
- Implements `calculateSalary()` method, specific to full-time employees.
- Contains additional attributes such as `monthsWorked` and `bonus`.

### `PartTimeEmployee`

- **Subclass** of `Employee`.
- Implements `calculateSalary()` method, specific to part-time employees.
- Contains additional attributes such as `hoursWorked` and `hourlyRate`.

### `UserInterface`

- Handles user input and output.
- Provides a menu-driven interface to interact with the system.
- Methods for adding employees, viewing employee details, and calculating salaries.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)** installed on your machine.

### Running the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/employee-management-system.git
   ```
