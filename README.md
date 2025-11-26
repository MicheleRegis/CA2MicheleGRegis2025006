# Department Store Employee Management System  
A Java-based console application implementing sorting, searching, employee management, and hierarchical visualization using binary trees.

---

## 📌 Overview
This project is a command-line employee management system designed for a **Department Store** environment. It demonstrates:

- Recursive sorting (Merge Sort)
- Searching in sorted lists (Binary Search)
- Employee data modelling using OOP
- Level-order binary tree insertion for organizational hierarchy
- Enum-based menu navigation
- Input validation
- File reading and memory storage

All functionality is implemented using **pure Java**, with **no external dependencies**.

---

## ✨ Main Features

### **1. Sort Employee Records**
Reads employee data from `Applicants_Form.txt`, then sorts the names alphabetically using a **recursive Merge Sort** implementation.

- Guarantees O(n log n) performance  
- Stable and predictable  
- Displays first 20 sorted names  

---

### **2. Search Employees**
After sorting, the system allows the user to search for an employee by name.

Uses **Binary Search**:

- O(log n) time complexity  
- Case-insensitive comparison  
- Returns:
  - Employee name  
  - Manager type  
  - Department  

---

### **3. Add New Employee**
Allows the user to:

- Enter name  
- Select Manager Type (Enum)
- Select Department (Enum)

New employees are stored **in memory** (not written to file) and the list is **re-sorted** after insertion.

---

### **4. Create Employee Hierarchy (Binary Tree)**
Builds a simple binary tree using **level-order (breadth-first) insertion**.

Displays:

- Hierarchy level by level  
- Total number of nodes  
- Height of tree  

Minimum **20 employees** required.

---

### **5. Enum-Based Terminal Menu**
All menu options are handled with Java Enums for:

- `MenuOption`
- `ManagerType`
- `DepartmentType`

This ensures safe and consistent navigation.

---

## 📁 Project Structure

src/
└── ca2michelegregis2025006/

├── CA2MicheleGRegis2025006.java # Main program (menu + orchestration)

├── Employee.java # Employee model class

├── MergeSort.java # Recursive Merge Sort

├── BinarySearch.java # Binary Search

├── BinaryTree.java # Binary tree hierarchy

└── Enums.java # Menu, ManagerType, DepartmentType
