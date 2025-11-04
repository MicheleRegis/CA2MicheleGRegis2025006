/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2michelegregis2025006;

/**
 * Employee class representing a department store employee
 * Contains name, manager type, and department information
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private String managerType;
    private String department;
    
    /**
     * Constructor for Employee
     * @param name Employee's full name
     * @param managerType Type of manager overseeing this employee
     * @param department Department where employee works
     */
    public Employee(String name, String managerType, String department) {
        this.name = name;
        this.managerType = managerType;
        this.department = department;
    }
    
    /**
     * Gets employee name
     * @return Employee name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets employee name
     * @param name New employee name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets manager type
     * @return Manager type
     */
    public String getManagerType() {
        return managerType;
    }
    
    /**
     * Sets manager type
     * @param managerType New manager type
     */
    public void setManagerType(String managerType) {
        this.managerType = managerType;
    }
    
    /**
     * Gets department
     * @return Department name
     */
    public String getDepartment() {
        return department;
    }
    
    /**
     * Sets department
     * @param department New department
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
    /**
     * Compares employees by name for sorting
     * Uses case-insensitive comparison
     * @param other Other employee to compare with
     * @return Negative if this < other, 0 if equal, positive if this > other
     */
    @Override
    public int compareTo(Employee other) {
        return this.name.compareToIgnoreCase(other.name);
    }
    
    /**
     * String representation of employee
     * @return Formatted string with employee details
     */
    @Override
    public String toString() {
        return String.format("%s | %s | %s", name, managerType, department);
    }
    
    /**
     * Checks equality based on name
     * @param obj Object to compare with
     * @return true if names are equal (case-insensitive)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return name.equalsIgnoreCase(employee.name);
    }
    
    /**
     * Generates hash code based on name
     * @return Hash code
     */
    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }
}