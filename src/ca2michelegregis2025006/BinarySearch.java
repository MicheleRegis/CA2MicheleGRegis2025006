/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2michelegregis2025006;
/**
 * Binary Search implementation for Employee lookup
 * *
* ALGORITHM JUSTIFICATION:
* Binary Search was chosen for the following reasons:
*
* 1. OPTIMAL TIME COMPLEXITY O(log n):
*    Binary Search is the most efficient algorithm for searching in a
*   Sorted array. It can search an array of size 'n' in O(log n) time complexity.
*   1000 employees in about 10 comparisons and 1,000,000 employees
*    In about 20 comparisons. This logarithmic growth makes it ideal for
* Performance enhancement, such as for systems that have to scale.
*
* 2. LEVERAGES SORTED DATA:
* Since we are already sorting the employees, a Binary Search can
It takes advantage of this sorted structure. It would be a waste to sort
*    data and then use linear search O(n) when Binary Search O(log n)
*    is available.
*
* 3. REAL-WORLD PERFORMANCE:
* In a busy department store, the managers need to look up employees quickly
*    for scheduling, assignments, and queries. Binary Search provides
* Near-instant results, even with a thousand plus employees.
* The linear search would become slow and noticeable as staff grew.
*
* 4. SPACE EFFICIENCY:
* Binary Search requires only O(1) auxiliary space, meaning it does not require extra space.
*    Data structures needed. This is important for systems with memory
*    constraints or when running on resource-limited hardware.
*
* 5. Simplicity and reliability
*    Binary Search is a well-understood, proven algorithm with no hidden
*    edge cases. Its straightforward logic makes it easy to maintain
Didactic Development and Debugging reduces maintenance costs in the long run.
*
* ALTERNATIVES CONSIDERED:
* - Linear Search O(n): Too slow for large datasets. With 10,000 employees,
In this case, *   average search time would be 5,000 comparisons vs. Binary Search's 14.
*
* - Hash Table O(1): While faster, requires additional O(n) space for
*   hash structure and doesn't support range queries or "closest match"
* searches which may be required by features in the future.
*
* - Interpolation Search O(log log n): More complex to implement and only
*   beneficial with uniformly distributed data. Employee names aren't
*   Uniformly distributed, making Binary Search more reliable.
*
* REQUIREMENT ALIGNMENT:
The assignment requires efficient searching in a sorted list. Binary
• Search is the textbook optimal solution to this requirement.
* balance perfectly among speed, simplicity, and space efficiency.
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
