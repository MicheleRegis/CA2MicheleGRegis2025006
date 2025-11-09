/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2michelegregis2025006;

/**
 * Recursive Merge Sort implementation for Employee sorting
 * 
 * ALGORITHM JUSTIFICATION:
 * Merge Sort was chosen for the following reasons:
 * 
 * 1. GUARANTEED O(n log n) TIME COMPLEXITY:
 *    Unlike Quick Sort which can degrade to O(n²) in worst case,
 *    Merge Sort always maintains O(n log n) performance regardless
 *    of input data order. This is critical for a production system
 *    that must handle various data patterns reliably.
 * 
 * 2. STABLE SORTING:
 *    Merge Sort is stable, meaning employees with identical names
 *    will maintain their relative order. This is important for
 *    maintaining data integrity when sorting by name while preserving
 *    secondary sort criteria like employee ID or hire date.
 * 
 * 3. PREDICTABLE PERFORMANCE:
 *    Department stores need consistent response times. Merge Sort's
 *    predictable O(n log n) behavior ensures the system won't suddenly
 *    slow down with certain data patterns, unlike algorithms with
 *    worst-case quadratic time.
 * 
 * 4. EFFICIENT FOR LARGE DATASETS:
 *    As the department store grows (potentially thousands of employees),
 *    Merge Sort scales well. Its O(n log n) complexity means doubling
 *    the employee count only slightly more than doubles the sort time.
 * 
 * 5. RECURSIVE NATURE REQUIREMENT:
 *    The assignment specifically requires a RECURSIVE sorting algorithm.
 *    Merge Sort's divide-and-conquer approach naturally fits recursive
 *    implementation, making it an ideal choice over iterative algorithms.
 * 
 * TRADE-OFFS CONSIDERED:
 * - Space Complexity: Merge Sort uses O(n) extra space for merging.
 *   This is acceptable given modern memory availability and the benefit
 *   of guaranteed performance.
 * - Quick Sort Alternative: While Quick Sort has better average space
 *   complexity O(log n), its worst-case O(n²) time is unacceptable
 *   for a production system requiring reliability.
 * - Heap Sort Alternative: Heap Sort has O(n log n) time and O(1) space,
 *   but it's NOT stable and harder to implement recursively cleanly.
 */
public class MergeSort {
    
    /**
     * Public method to start recursive merge sort
     * @param employees Array of employees to sort
     * @param left Starting index
     * @param right Ending index
     */
    public static void sort(Employee[] employees, int left, int right) {
        // Base case: array of size 1 or 0 is already sorted
        if (left < right) {
            // Find the middle point to divide the array into two halves
            int middle = left + (right - left) / 2;
            
            // Recursively sort the first half
            sort(employees, left, middle);
            
            // Recursively sort the second half
            sort(employees, middle + 1, right);
            
            // Merge the sorted halves
            merge(employees, left, middle, right);
        }
    }
    
    /**
     * Merges two sorted subarrays into one sorted array
     * @param employees Array containing subarrays to merge
     * @param left Starting index of first subarray
     * @param middle Ending index of first subarray
     * @param right Ending index of second subarray
     */
    private static void merge(Employee[] employees, int left, int middle, int right) {
        // Calculate sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;
        
        // Create temporary arrays
        Employee[] leftArray = new Employee[n1];
        Employee[] rightArray = new Employee[n2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = employees[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = employees[middle + 1 + j];
        }
        
        // Merge the temporary arrays back into employees[left..right]
        int i = 0;  // Initial index of first subarray
        int j = 0;  // Initial index of second subarray
        int k = left;  // Initial index of merged subarray
        
        // Compare elements from both arrays and merge in sorted order
        while (i < n1 && j < n2) {
            // Use compareTo for case-insensitive alphabetical comparison
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                employees[k] = leftArray[i];
                i++;
            } else {
                employees[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of leftArray[], if any
        while (i < n1) {
            employees[k] = leftArray[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of rightArray[], if any
        while (j < n2) {
            employees[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
