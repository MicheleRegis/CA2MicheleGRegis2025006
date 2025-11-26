# Department Store Employee Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![License](https://img.shields.io/badge/License-Academic-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Complete-success?style=for-the-badge)

A comprehensive employee management system for department stores, featuring recursive sorting algorithms, binary search functionality, and hierarchical visualization using binary trees.

## 📋 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [System Requirements](#-system-requirements)
- [Project Structure](#-project-structure)
- [Installation](#-installation)
- [Usage](#-usage)
- [Algorithms](#-algorithms)
- [Data Structures](#️-data-structures)
- [Testing](#-testing)
- [Documentation](#-documentation)
- [Author](#-author)
- [License](#-license)
- [Contact](#-contact)
- [Version History](#-version-history)
- [Learning Outcomes](#-learning-outcomes)

## 🎯 Overview

This system was developed as an integrated assignment for **Algorithms & Constructs** and **Software Development Fundamentals** modules. It demonstrates:

- ✅ Object-Oriented Programming principles
- ✅ Recursive algorithms (Merge Sort)
- ✅ Search algorithms (Binary Search)
- ✅ Data structures (Binary Trees with level-order insertion)
- ✅ Input validation and error handling
- ✅ Enum-based menu navigation
- ✅ File I/O operations

### Business Context

The system manages employees in a department store environment, allowing HR managers and administrators to:

- Sort employee records alphabetically
- Search for specific employees
- Add new employees with validated inputs
- Visualize organizational hierarchy

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

- ⚡ Guaranteed **O(n log n)** performance with Merge Sort
- 🔒 Stable sorting (preserves order of equal elements)
- 🎯 Enum-based navigation and type safety
- ✔️ Full input validation
- 🚀 Pure Java — no external dependencies
- 📖 Clean and readable code

## 💻 System Requirements

- Java JDK 8 or higher
- NetBeans 8.2+
- Windows, macOS, or Linux
- Minimum 512MB RAM
- ~50MB free disk space

## 📁 Project Structure

```
CA2MicheleGincaloRegis2025006/
│
├── src/
│   └── CA2MicheleGoncaloRegis2025006/
│       ├── CA2MicheleGoncaloRegis2025006.java
│       ├── Enums.java
│       ├── Employee.java
│       ├── MergeSort.java
│       ├── BinarySearch.java
│       └── BinaryTree.java
│
├── Applicants_Form.txt
├── README.md
└── Algorithm_Rationale.pdf
```

## 🚀 Installation

### Step 1 — Clone the Repository

```bash
git clone https://github.com/MicheleRegis/CA2MicheleGoncaloRegis2025006.git
cd CA2MicheleGoncaloRegis2025006
```

### Step 2 — Open in NetBeans

1. File → Open Project → Select project folder

### Step 3 — Ensure Data File Exists

- Place `Applicants_Form.txt` in the project root folder.

### Step 4 — Run the Program

- Right-click → Clean and Build → Run (F6)

## 📖 Usage

### Program Menu

```
========== MAIN MENU ==========
1. Sort Employees
2. Search Employee
3. Add New Employee
4. Create Employee Hierarchy
5. Exit System
```

### Example Outputs

#### Sort Employees
- Reads file
- Sorts with Merge Sort
- Shows first 20 names

#### Search Employee
- Binary search returns full employee details.

#### Add Employee
- Name validation
- Manager type and department selection
- Adds to memory and re-sorts

#### Create Employee Hierarchy
- Builds binary tree
- Displays levels
- Shows height and total nodes

## 🧮 Algorithms

### Merge Sort

- **Complexity:** O(n log n)
- **Type:** Stable
- **Method:** Recursive
- **File:** `MergeSort.java`

### Binary Search

- **Complexity:** O(log n)
- **Requirement:** Requires sorted list
- **File:** `BinarySearch.java`

## 🗂️ Data Structures

### Binary Tree

- Level-order insertion
- Level-order traversal
- Calculates height & node count
- **File:** `BinaryTree.java`

## 🧪 Testing

### Test Data

`Applicants_Form.txt` contains:
- 30 employees
- 5 manager types
- 8 departments
- Clean CSV format

### Manual Testing Checklist

- ✅ Sort with valid/invalid file
- ✅ Search existing/non-existing
- ✅ Add new employee
- ✅ Tree with <20 and >20 employees
- ✅ Invalid menu inputs

### Documented Unit Tests

- UT-SORT-001
- UT-SEARCH-001
- UT-VALIDATE-001

## 📚 Documentation Files

| File | Description | Location |
|------|-------------|----------|
| README.md | Project overview | Root |
| Algorithm_Report.pdf | Algorithm explanations | Root |
| Use_Cases.pdf | 5 use cases | Documentation |
| UML_Diagrams.pdf | Class & sequence diagrams | Documentation |
| Requirements.pdf | Requirements list | Documentation |
| User_Stories.pdf | 5 user stories | Documentation |
| Unit_Tests.pdf | 3 unit tests | Documentation |

## 👨‍💻 Author

**Michele Goncalo Régis**  
Student ID: 2025006

## 📄 License

This project was created for academic purposes as part of the **H.Dip. in Computing, CCT College Dublin**.

## 📞 Contact

- 📧 Email: 2025006@student.cct.ie
- 💻 GitHub: [https://github.com/MicheleRegis](https://github.com/MicheleRegis)

## 🔄 Version History

| Version | Date | Description |
|---------|------|-------------|
| 1.0.0 | Nov 2025 | Initial release |
| 1.0.1 | Nov 2025 | Added documentation |
| 1.0.2 | Nov 2025 | Final testing and fixes |

## 🎯 Learning Outcomes Demonstrated

### Algorithms & Constructs
- Algorithm design
- Merge Sort
- Binary Search
- Binary Tree

### Software Development Fundamentals
- Process modelling
- UML
- User stories
- Unit testing

---

⭐ **If this project helped you understand algorithms and data structures, consider giving it a star!** ⭐

Made with ☕ and 💻 by Michele Goncalo Régis
