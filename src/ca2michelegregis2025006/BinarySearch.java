/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2michelegregis2025006;
/**
 * Binary Search implementation for Employee lookup
 * 
 * ALGORITHM JUSTIFICATION:
 * Binary Search was chosen for the following reasons:
 * 
 * 1. OPTIMAL TIME COMPLEXITY O(log n):
 *    Binary Search is the most efficient algorithm for searching in a
 *    sorted array. With O(log n) time complexity, it can search through
 *    1000 employees in about 10 comparisons, and 1,000,000 employees
 *    in about 20 comparisons. This logarithmic growth makes it ideal
 *    for systems that need to scale.
 * 
 * 2. LEVERAGES SORTED DATA:
 *    Since we're already sorting employees (requirement), Binary Search
 *    capitalizes on this sorted structure. It would be wasteful to sort
 *    data and then use linear search O(n) when Binary Search O(log n)
 *    is available.
 * 
 * 3. REAL-WORLD PERFORMANCE:
 *    In a busy department store, managers need quick employee lookups
 *    for scheduling, assignments, and queries. Binary Search provides
 *    near-instantaneous results even with thousands of employees.
 *    Linear search would become noticeably slow as staff grows.
 * 
 * 4. SPACE EFFICIENCY:
 *    Binary Search requires only O(1) auxiliary space - no additional
 *    data structures needed. This is important for systems with memory
 *    constraints or when running on resource-limited hardware.
 * 
 * 5. SIMPLICITY AND RELIABILITY:
 *    Binary Search is a well-understood, proven algorithm with no hidden
 *    edge cases. Its straightforward logic makes it easy to maintain
 *    and debug, reducing long-term maintenance costs.
 * 
 * ALTERNATIVES CONSIDERED:
 * - Linear Search O(n): Too slow for large datasets. With 10,000 employees,
 *   average search time would be 5,000 comparisons vs Binary Search's 14.
 * 
 * - Hash Table O(1): While faster, requires additional O(n) space for
 *   hash structure and doesn't support range queries or "closest match"
 *   searches that may be needed in future features.
 * 
 * - Interpolation Search O(log log n): More complex to implement and only
 *   beneficial with uniformly distributed data. Employee names aren't
 *   uniformly distributed, making Binary Search more reliable.
 * 
 * REQUIREMENT ALIGNMENT:
 * The assignment requires efficient searching in a sorted list. Binary
 * Search is the textbook optimal solution for this specific requirement,
 * balancing speed, simplicity, and space efficiency perfectly.
 */
public class BinarySearch {
    
    /**
     * Performs binary search to find employee by name
     * @param employees Sorted array of employees
     * @param targetName Name to search for
     * @return Index of employee if found, -1 otherwise
     */
    public static int search(Employee[] employees, String targetName) {
        // Validate input
        if (employees == null || employees.length == 0 || targetName == null) {
            return -1;
        }
        
        // Initialize search boundaries
        int left = 0;
        int right = employees.length - 1;
        
        // Iterative binary search
        while (left <= right) {
            // Calculate middle index (prevents integer overflow)
            int middle = left + (right - left) / 2;
            
            // Get middle employee for comparison
            Employee middleEmployee = employees[middle];
            
            // Compare target name with middle employee name (case-insensitive)
            int comparison = targetName.compareToIgnoreCase(middleEmployee.getName());
            
            if (comparison == 0) {
                // Found exact match
                return middle;
            } else if (comparison < 0) {
                // Target is in left half
                right = middle - 1;
            } else {
                // Target is in right half
                left = middle + 1;
            }
        }
        
        // Employee not found
        return -1;
    }
    
    /**
     * Alternative recursive implementation of binary search
     * Included to demonstrate recursive approach
     * @param employees Sorted array of employees
     * @param targetName Name to search for
     * @param left Left boundary of search range
     * @param right Right boundary of search range
     * @return Index of employee if found, -1 otherwise
     */
    public static int searchRecursive(Employee[] employees, String targetName, 
                                     int left, int right) {
        // Base case: search space exhausted
        if (left > right) {
            return -1;
        }
        
        // Calculate middle index
        int middle = left + (right - left) / 2;
        
        // Get middle employee
        Employee middleEmployee = employees[middle];
        
        // Compare target with middle employee
        int comparison = targetName.compareToIgnoreCase(middleEmployee.getName());
        
        if (comparison == 0) {
            // Found exact match
            return middle;
        } else if (comparison < 0) {
            // Search in left half
            return searchRecursive(employees, targetName, left, middle - 1);
        } else {
            // Search in right half
            return searchRecursive(employees, targetName, middle + 1, right);
        }
    }
}