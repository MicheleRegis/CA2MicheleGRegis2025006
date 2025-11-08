# 🏪 Department Store Employee Management System

[![Java](https://img.shields.io/badge/Java-8%2B-orange.svg)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-Academic-blue.svg)]()
[![Status](https://img.shields.io/badge/Status-Complete-success.svg)]()

A comprehensive employee management system for department stores, featuring recursive sorting algorithms, binary search functionality, and hierarchical visualization using binary trees.

---

## 🎯 Overview

This system was developed as an integrated assignment for **Algorithms & Constructs** and **Software Development Fundamentals** modules. It demonstrates:

- **Object-Oriented Programming** principles
- **Recursive algorithms** (Merge Sort)
- **Search algorithms** (Binary Search)
- **Data structures** (Binary Trees with level-order insertion)
- **Input validation** and error handling
- **Enum-based menu** navigation
- **File I/O** operations

### Business Context

The system manages employees in a department store environment, allowing HR managers and administrators to:
- Sort employee records alphabetically
- Search for specific employees
- Add new employees with validated inputs
- Visualize organizational hierarchy

---

## ✨ Features

### Core Functionality

| Feature | Description | Complexity |
|---------|-------------|------------|
| **Sort Employees** | Recursive Merge Sort algorithm | O(n log n) |
| **Search Employees** | Binary Search implementation | O(log n) |
| **Add Records** | Input validation for new employees | O(1) |
| **Hierarchy View** | Binary tree with level-order insertion | O(n) |
| **Menu System** | Enum-based navigation | O(1) |

### Technical Highlights

- ✅ **Guaranteed Performance**: Merge Sort provides O(n log n) in all cases
- ✅ **Stable Sorting**: Maintains relative order of equal elements
- ✅ **Type Safety**: Enum-based menu and employee types
- ✅ **Comprehensive Validation**: All user inputs validated
- ✅ **Well-Commented Code**: Clear explanations throughout
- ✅ **No External Dependencies**: Pure Java implementation

---

## 💻 System Requirements

- **Java Development Kit (JDK)**: Version 8 or higher
- **IDE**: NetBeans 8.2+ 
- **Operating System**: Windows, macOS, or Linux
- **Memory**: Minimum 512MB RAM
- **Storage**: 50MB free space

---

## 📁 Project Structure

```
CA2MicheleGincaloRegis2025006/
│
├── src/
│   └── CA2MicheleGoncaloRegis2025006/
│       ├── CA2MicheleGoncaloRegis2025006.java    # Main application class
│       ├── Enums.java                            # Menu, Manager, and Department enums
│       ├── Employee.java                         # Employee data model
│       ├── MergeSort.java                        # Recursive sorting algorithm
│       ├── BinarySearch.java                     # Binary search algorithm
│       └── BinaryTree.java                       # Binary tree implementation
│
├── Applicants_Form.txt                  # Sample employee data (30 records)
├── README.md                            # This file
└── Algorithm_Rationale.pdf              # Algorithm justification report

```

---

## 🚀 Installation

### Step 1: Clone the Repository

```bash
git clone https://github.com/[MicheleRegis]/CA2MicheleGoncaloRegis2025006.git
cd CA2MicheleGoncaloRegis2025006
```

### Step 2: Open in NetBeans

1. Open NetBeans IDE
2. File → Open Project
3. Navigate to `CA2MicheleGoncaloRegis2025006` folder
4. Click "Open Project"

### Step 3: Verify Data File

Ensure `Applicants_Form.txt` is in the **project root directory** (not inside `src/`).

### Step 4: Build and Run

1. Right-click on the project
2. Select "Clean and Build"
3. Click "Run" or press F6

---

## 📖 Usage

### Menu Options

When you run the application, you'll see:

```
========================================
 DEPARTMENT STORE MANAGEMENT SYSTEM
========================================

========== MAIN MENU ==========
1. Sort Employees
2. Search Employee
3. Add New Employee
4. Create Employee Hierarchy
5. Exit System

Please enter your choice (1-5):
```

### Option 1: Sort Employees

```
Please enter the filename to read: Applicants_Form.txt
File read successfully!
Total employees loaded: 30
Sorting employees using Merge Sort...
Sorting completed in 2ms

========== SORTED EMPLOYEES (First 20) ==========
1. Abigail Walker
2. Alexander Jackson
3. Amelia Garcia
...
```

### Option 2: Search Employee

```
Enter employee name to search: Michael Johnson

========== EMPLOYEE FOUND ==========
Name: Michael Johnson
Manager Type: STORE_MANAGER
Department: Electronics
=====================================
```

### Option 3: Add New Employee

```
Enter employee name: Sarah Connor
Available Manager Types:
1. Store Manager
2. Department Manager
3. Team Lead
4. Shift Supervisor
5. Assistant Manager
Select manager type (1-5): 3

Available Departments:
1. Electronics
2. Clothing
3. Grocery
...
Select department (1-8): 1

✓ Employee added successfully!
```

### Option 4: Create Employee Hierarchy

```
Building binary tree with level-order insertion...

========== EMPLOYEE HIERARCHY ==========

Level 1:
--------
1. Michael Johnson | STORE_MANAGER | Electronics

Level 2:
--------
1. Sarah Williams | DEPARTMENT_MANAGER | Clothing
2. David Brown | TEAM_LEAD | Grocery
...

========== TREE STATISTICS ==========
Tree Height: 5
Total Nodes: 30
=====================================
```

---

## 🧮 Algorithms

### Merge Sort - Recursive

**Time Complexity:** O(n log n) - guaranteed in all cases  
**Space Complexity:** O(n)  
**Stability:** Stable sort

**Why Merge Sort?**
- Consistent O(n log n) performance (no worst-case degradation)
- Stable sorting maintains order of equal elements
- Natural recursive implementation
- Predictable behavior for production systems

**Code Location:** `MergeSort.java`

### Binary Search

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)  
**Requirement:** Sorted array

**Why Binary Search?**
- Optimal for sorted data (O(log n) vs O(n) linear search)
- Space-efficient (no additional structures needed)
- Fast lookups essential for HR operations
- Scales well with large datasets

**Code Location:** `BinarySearch.java`

---

## 🗂️ Data Structures

### Binary Tree - Level-Order Insertion

**Purpose:** Visualize organizational hierarchy  
**Insertion:** Breadth-first (level by level, left to right)  
**Operations:**
- Insert: O(n) - must find next available position
- Display: O(n) - level-order traversal
- Height: O(n) - recursive calculation
- Count: O(1) - maintained during insertion

**Features:**
- Balanced growth (fills each level completely)
- Easy visualization of reporting structure
- Efficient height calculation
- Node counting

**Code Location:** `BinaryTree.java`

---

## 🧪 Testing

### Test Data

The provided `Applicants_Form.txt` contains 30 employee records for testing:
- Various manager types (5 types)
- Multiple departments (8 departments)
- Mix of common and unique names
- Pre-formatted CSV structure

---

## 📚 Documentation

### Core Documentation Files

| Document | Description | Location |
|----------|-------------|----------|
| README.md | This file | Root directory |
| Algorithm_Rationale.md | Algorithm justifications - 500 words | Root directory |


### Code Documentation

All Java classes include:
- Class-level JavaDoc comments
- Method-level documentation
- Inline comments for complex logic
- Algorithm complexity analysis
- Design rationale

---

## 👨‍💻 Author

**Michele Goncalo Régis**  
Student ID: 2025006


**Assignment:** CA 2 - Integrated Algorithms & Constructs + Software Development Fundamentals  

---

## 📄 License

This project is developed for academic purposes at CCT College Dublin.

---

## 🙏 Acknowledgments

- **Taufique Ahmed** - Algorithms & Constructs Lecturer
- **CCT College Dublin** - For providing comprehensive course materials

---

## 📞 Contact

For questions or clarifications regarding this project:

- **Email:** 2025006@student.cct.ie
- **GitHub:** github.com/MicheleRegis

---


## 🎯 Learning Outcomes Demonstrated

### Algorithms & Constructs
✅ Evaluate and select appropriate algorithms (Merge Sort, Binary Search)  
✅ Use recursive algorithms for problem solving  
✅ Implement data structures (Binary Tree)  
✅ Analyze algorithm complexity


<div align="center">

**⭐ If this project helped you understand algorithms and data structures, consider giving it a star! ⭐**

Made with ☕ and 💻 by Michele Goncalo Régis

</div>
