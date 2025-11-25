/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2michelegregis2025006;

import ca2michelegregis2025006.Enums.DepartmentType;
import ca2michelegregis2025006.Enums.ManagerType;
import ca2michelegregis2025006.Enums.MenuOption;
import java.io.*;
import java.util.*;

/**
 *
 * @author Michele Regis
 * Main class for Department Store Employee Management System
 * @date November 2025
 *
 * This application manages employees in a department store with sorting,
 * searching, adding records, and hierarchical visualization features.
 */

public class CA2MicheleGRegis2025006 {



    // Scanner for user input
    private static final Scanner scanner = new Scanner(System.in);

    // Collections to store data
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static final ArrayList<Employee> newEmployees = new ArrayList<>();
    
    // Flag to track if file has been loaded already
private static boolean fileLoaded = false;


    /**
     * Main entry point of the application
     * @param args
     */
    public static void main(String[] args) {
        try (scanner) {
            System.out.println("========================================");
            System.out.println(" DEPARTMENT STORE MANAGEMENT SYSTEM");
            System.out.println("========================================\n");

            // Main program loop
            boolean running = true;
            while (running) {
                displayMenu();
                MenuOption choice = getMenuChoice();

                switch (choice) {
                    case SORT -> handleSort();
                    case SEARCH -> handleSearch();
                    case ADD_RECORDS -> handleAddRecords();
                    case CREATE_TREE -> handleCreateTree();
                    case EXIT -> {
                        running = false;
                        System.out.println("\nThank you for using Department Store System!");
                    }
                }
            }
        }
    }

    /**
     * Displays the main menu using enum values
     */
    private static void displayMenu() {
        System.out.println("\n========== MAIN MENU ==========");
        int index = 1;
        for (MenuOption option : MenuOption.values()) {
            System.out.println(index + ". " + option.getDisplayName());
            index++;
        }
        System.out.print("\nPlease enter your choice (1-5): ");
    }

    /**
     * Gets and validates menu choice from user
     * @return Selected MenuOption
     */
    private static MenuOption getMenuChoice() {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= MenuOption.values().length) {
                    return MenuOption.values()[choice - 1];
                } else {
                    System.out.print("Invalid choice! Please enter 1-5: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number (1-5): ");
            }
        }
    }

    /**
     * Handles SORT functionality
     * If the list is empty, loads from file. Otherwise, just sorts
     * the current in-memory list (including newly added employees).
     */
    /**
 * Handles SORT functionality
 * Loads employees from file once and keeps newly added employees
 * in memory for future sorts.
 */
private static void handleSort() {
    System.out.println("\n========== SORT EMPLOYEES ==========");

    
    if (!fileLoaded) {
        // Temporarily save the employees already entered in memory
        List<Employee> tempNewEmployees = new ArrayList<>(employeeList);

        String filename = "Applicants_Form.txt";
        if (!readEmployeesFromFile(filename)) {
            return; // error reading file
        }

        System.out.println("File read successfully!");

        // Now employeeList has the employees from the file.
        // We re-added those that had already been inserted before (ADD_RECORDS)
        employeeList.addAll(tempNewEmployees);

        //Mark that the file has already been uploaded to avoid repeating it in the future
        fileLoaded = true;
    } else {
        // File has already been uploaded previously
        // employeeList already contains: data from the file + newly added
        System.out.println("Using employees currently in memory (including newly added).");
    }

    System.out.println("Total employees loaded: " + employeeList.size());

    // Converts to array for sorting
    Employee[] employeeArray = employeeList.toArray(Employee[]::new);

    // Sorts using recursive Merge Sort
    System.out.println("\nSorting employees using Merge Sort...");
    long startTime = System.currentTimeMillis();
    MergeSort.sort(employeeArray, 0, employeeArray.length - 1);
    long endTime = System.currentTimeMillis();

    System.out.println("Sorting completed in " + (endTime - startTime) + "ms");

    // Updates list with sorted array
    employeeList = new ArrayList<>(Arrays.asList(employeeArray));

    // Show the first 25
    System.out.println("\n========== SORTED EMPLOYEES (First 25) ==========");
    int displayCount = Math.min(25, employeeList.size());
    for (int i = 0; i < displayCount; i++) {
        System.out.println((i + 1) + ". " + employeeList.get(i).getName());
    }

    if (employeeList.size() > 25) {
        System.out.println("\n... and " + (employeeList.size() - 25) + " more employees");
    }
}


    /**
     * Handles SEARCH functionality
     * Uses binary search to find employee by name
     */
    private static void handleSearch() {
        System.out.println("\n========== SEARCH EMPLOYEE ==========");

        if (employeeList.isEmpty()) {
            System.out.println("No employees loaded. Please sort first (Option 1).");
            return;
        }

        System.out.print("Enter employee name to search: ");
        String searchName = scanner.nextLine().trim();

        // Binary search on sorted list
        Employee[] employeeArray = employeeList.toArray(Employee[]::new);
        int index = BinarySearch.search(employeeArray, searchName);

        if (index != -1) {
            Employee found = employeeArray[index];
            System.out.println("\n========== EMPLOYEE FOUND ==========");
            System.out.println("Name: " + found.getName());
            System.out.println("Manager Type: " + found.getManagerType());
            System.out.println("Department: " + found.getDepartment());
            System.out.println("=====================================");
        } else {
            System.out.println("\nEmployee '" + searchName + "' not found in the system.");
        }
    }

    /**
     * Handles ADD_RECORDS functionality
     * Validates input and adds new employee
     */
    private static void handleAddRecords() {
        System.out.println("\n========== ADD NEW EMPLOYEE ==========");

        // Get employee name
        String name = getValidatedName();

        // Get manager type
        ManagerType managerType = getValidatedManagerType();

        // Get department
        DepartmentType department = getValidatedDepartment();

        // Create and add employee
        Employee newEmployee = new Employee(
                name,
                managerType.getDisplayName(),
                department.getDisplayName()
        );

        employeeList.add(newEmployee);
        newEmployees.add(newEmployee);

        System.out.println("\n✓ Employee added successfully!");

        // Re-sort list to keep Binary Search valid and to include the new employee
        Employee[] arr = employeeList.toArray(Employee[]::new);
        MergeSort.sort(arr, 0, arr.length - 1);
        employeeList = new ArrayList<>(Arrays.asList(arr));

        // Display all newly added records
        if (!newEmployees.isEmpty()) {
            System.out.println("\n========== NEWLY ADDED EMPLOYEES ==========");
            for (int i = 0; i < newEmployees.size(); i++) {
                Employee emp = newEmployees.get(i);
                System.out.println((i + 1) + ". " + emp.getName()
                        + " | " + emp.getManagerType()
                        + " | " + emp.getDepartment());
            }
        }
    }

    /**
     * Validates and gets employee name from user
     * @return Valid employee name
     */
    private static String getValidatedName() {
        while (true) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("✗ Name cannot be empty! Please try again.");
            } else if (name.length() < 2) {
                System.out.println("✗ Name must be at least 2 characters! Please try again.");
            } else {
                return name;
            }
        }
    }

    /**
     * Validates and gets manager type from user
     * @return Valid ManagerType enum
     */
    private static ManagerType getValidatedManagerType() {
        while (true) {
            System.out.println("\nAvailable Manager Types:");
            int index = 1;
            for (ManagerType type : ManagerType.values()) {
                System.out.println(index + ". " + type.getDisplayName());
                index++;
            }

            System.out.print("Select manager type (1-" + ManagerType.values().length + "): ");
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= ManagerType.values().length) {
                    return ManagerType.values()[choice - 1];
                } else {
                    System.out.println("✗ Invalid choice! Please select a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("✗ Please enter a valid number!");
            }
        }
    }

    /**
     * Validates and gets department from user
     * @return Valid DepartmentType enum
     */
    private static DepartmentType getValidatedDepartment() {
        while (true) {
            System.out.println("\nAvailable Departments:");
            int index = 1;
            for (DepartmentType dept : DepartmentType.values()) {
                System.out.println(index + ". " + dept.getDisplayName());
                index++;
            }

            System.out.print("Select department (1-" + DepartmentType.values().length + "): ");
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= DepartmentType.values().length) {
                    return DepartmentType.values()[choice - 1];
                } else {
                    System.out.println("✗ Invalid choice! Please select a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("✗ Please enter a valid number!");
            }
        }
    }

    /**
     * Handles CREATE_TREE functionality
     * Creates binary tree with level-order insertion
     */
    private static void handleCreateTree() {
        System.out.println("\n========== CREATE EMPLOYEE HIERARCHY ==========");

        if (employeeList.size() < 20) {
            System.out.println("✗ Minimum 20 employee records required!");
            System.out.println("Current records: " + employeeList.size());
            System.out.println("Please add more employees or load data from file.");
            return;
        }

        // Create binary tree with level-order insertion
        BinaryTree tree = new BinaryTree();
        System.out.println("Building binary tree with level-order insertion...");

        for (Employee emp : employeeList) {
            tree.insertLevelOrder(emp);
        }

        System.out.println("\n========== EMPLOYEE HIERARCHY ==========");
        tree.displayLevelOrder();

        System.out.println("\n========== TREE STATISTICS ==========");
        System.out.println("Tree Height: " + tree.getHeight());
        System.out.println("Total Nodes: " + tree.getNodeCount());
        System.out.println("=====================================");
    }

    /**
     * Reads employee data from file
     * @param filename Name of file to read
     * @return true if successful, false otherwise
     */
    private static boolean readEmployeesFromFile(String filename) {
        employeeList.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                line = line.trim();

                if (line.isEmpty()) {
                    continue;
                }

                // Parse line: Name,ManagerType,Department
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    String managerType = parts[1].trim();
                    String department = parts[2].trim();

                    employeeList.add(new Employee(name, managerType, department));
                } else {
                    System.out.println("Warning: Invalid format at line " + lineNumber);
                }
            }

            return true;

        } catch (FileNotFoundException e) {
            System.out.println("✗ Error: File '" + filename + "' not found!");
            System.out.println("Please check the filename and try again.");
            return false;
        } catch (IOException e) {
            System.out.println("✗ Error reading file: " + e.getMessage());
            return false;
        }
    }
}
  
