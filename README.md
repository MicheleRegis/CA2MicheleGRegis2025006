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

- Hierarchy level by level  # Department Store Employee Management System
**Java License Status**

A comprehensive employee management system for department stores, featuring recursive sorting algorithms, binary search functionality, and hierarchical visualization using binary trees.

---

## 📋 Table of Contents
- Overview
- Features
- System Requirements
- Project Structure
- Installation
- Usage
- Algorithms
- Data Structures
- Testing
- Documentation
- Author
- License
- Contact
- Version History
- Learning Outcomes

---

## 🎯 Overview
This system was developed as an integrated assignment for Algorithms & Constructs and Software Development Fundamentals modules. It demonstrates:

- Object-Oriented Programming principles  
- Recursive algorithms (Merge Sort)  
- Search algorithms (Binary Search)  
- Data structures (Binary Trees with level-order insertion)  
- Input validation and error handling  
- Enum-based menu navigation  
- File I/O operations  

### Business Context  
The system manages employees in a department store environment, allowing HR managers and administrators to:

- Sort employee records alphabetically  
- Search for specific employees  
- Add new employees with validated inputs  
- Visualize organizational hierarchy  

---

## ✨ Features

### Core Functionality

| Feature          | Description                             | Complexity |
|------------------|-------------------------------------------|------------|
| Sort Employees   | Recursive Merge Sort algorithm           | O(n log n) |
| Search Employees | Binary Search implementation             | O(log n)   |
| Add Records      | Input validation for new employees       | O(1)       |
| Hierarchy View   | Binary tree with level-order insertion   | O(n)       |
| Menu System      | Enum-based navigation                    | O(1)       |

### Technical Highlights
- ✅ Guaranteed O(n log n) performance with Merge Sort  
- ✅ Stable sorting (preserves order of equal elements)  
- ✅ Type-safe menu using Enums  
- ✅ Full input validation  
- ✅ Pure Java — no external dependencies  
- ✅ Clean and well-documented code  

---

## 💻 System Requirements
- **Java Development Kit (JDK):** Version 8 or higher  
- **IDE:** NetBeans 8.2+  
- **Operating System:** Windows, macOS, or Linux  
- **Memory:** Minimum 512MB RAM  
- **Storage:** 50MB free space  

---

## 📁 Project Structure



CA2MicheleGincaloRegis2025006/

│
├── src/

│ └── CA2MicheleGoncaloRegis2025006/

│ ├── CA2MicheleGoncaloRegis2025006.java # Main application class

│ ├── Enums.java # Menu, Manager, and Department enums

│ ├── Employee.java # Employee data model

│ ├── MergeSort.java # Recursive sorting algorithm

│ ├── BinarySearch.java # Binary search algorithm

│ └── BinaryTree.java # Binary tree implementation

│

├── Applicants_Form.txt # Sample employee data (30 records)

├── README.md # This file

└── Algorithm_Rationale.pdf # Algorithm justification report



---

## 🚀 Installation

### **Step 1: Clone the Repository**
```bash
git clone https://github.com/MicheleRegis/CA2MicheleGoncaloRegis2025006.git
cd CA2MicheleGoncaloRegis2025006



