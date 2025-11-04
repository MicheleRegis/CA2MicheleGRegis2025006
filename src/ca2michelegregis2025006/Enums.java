/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2michelegregis2025006;

/**
 *
 * @author hamdal
 */
public class Enums {
    /**
 * Enum for Menu Options
 * Provides type-safe menu navigation
 */
enum MenuOption {
    SORT("Sort Employees"),
    SEARCH("Search Employee"),
    ADD_RECORDS("Add New Employee"),
    CREATE_TREE("Create Employee Hierarchy"),
    EXIT("Exit System");
    
    private final String displayName;
    
    MenuOption(String displayName) {
        this.displayName = displayName;
    }
    
    public String getDisplayName() {
        return displayName;
    }
}

/**
 * Enum for Manager Types in Department Store
 * Represents different management levels
 */
enum ManagerType {
    STORE_MANAGER("Store Manager"),
    DEPARTMENT_MANAGER("Department Manager"),
    TEAM_LEAD("Team Lead"),
    SHIFT_SUPERVISOR("Shift Supervisor"),
    ASSISTANT_MANAGER("Assistant Manager");
    
    private final String displayName;
    
    ManagerType(String displayName) {
        this.displayName = displayName;
    }
    
    public String getDisplayName() {
        return displayName;
    }
}

/**
 * Enum for Department Types in Department Store
 * Represents different store departments
 */
enum DepartmentType {
    ELECTRONICS("Electronics"),
    CLOTHING("Clothing"),
    GROCERY("Grocery"),
    HOME_GARDEN("Home & Garden"),
    TOYS("Toys"),
    SPORTS("Sports & Fitness"),
    BEAUTY("Beauty & Personal Care"),
    AUTOMOTIVE("Automotive");
    
    private final String displayName;
    
    DepartmentType(String displayName) {
        this.displayName = displayName;
    }
    
    public String getDisplayName() {
        return displayName;
    }
}
    
}
