# 🎓 Campus Management System — Java OOP Project

A beginner-friendly, single-file Java console application that models a small **Campus Management System** (students, faculty, enrollment, fees, attendance, and grades).

Built specifically to demonstrate every core **Object-Oriented Programming (OOP)** concept in one clean, runnable file.

---

## 📌 About the Project

This project simulates a mini campus system where:
- Students and Faculty are enrolled and managed
- Students pay fees and get their attendance marked
- Grades are calculated from marks
- All records are saved to a text file

It's intentionally simple so that every OOP concept is easy to spot and understand — perfect for revision, viva prep, or as a portfolio project.

---

## 🚀 How to Run

**Requirements:** JDK 8 or above installed.

```bash
# 1. Clone the repository
git clone https://github.com/AnubhavSinghZ/campus-management-system.git
cd campus-management-system

# 2. Compile
javac Main.java

# 3. Run
java Main
```

Running the program will:
1. Create Student and Faculty objects
2. Enroll students into a class
3. Process fee payments and mark attendance
4. Calculate grades (including handling an invalid grade error)
5. Look up a student by ID
6. Trigger and catch an "enrollment full" error
7. Save all student records to `student_records.txt`

---

## 🧠 OOP Concepts Covered

| # | Concept | Where to Find It |
|---|---------|-------------------|
| 1 | Class & Object | `Student`, `Faculty`, `Person`, `Main` |
| 2 | Constructors (parameterized) | `Person`, `Student`, `Faculty` |
| 3 | Encapsulation (private fields + getters/setters) | `Person` class |
| 4 | Inheritance (single & multilevel) | `Student extends Person`, `Faculty extends Person` |
| 5 | Runtime Polymorphism (Method Overriding) | `getRole()`, `toString()` |
| 6 | Compile-time Polymorphism (Method Overloading) | `GradeCalculator.calculate(...)` (3 versions) |
| 7 | Abstraction (Abstract Class) | `Person` |
| 8 | Abstraction (Interfaces) | `Payable`, `Attendable` |
| 9 | Custom Exception Handling | `InvalidGradeException`, `EnrollmentFullException` |
| 10 | Static Members | `Student.counter` (auto-generates student IDs) |
| 11 | Collections (ArrayList, HashMap) | `EnrollmentService` |
| 12 | File Handling | `EnrollmentService.saveToFile()` |

Every concept is also marked with numbered comments directly inside `Main.java`, so you can search the file (e.g. search for `4. INHERITANCE`) and jump straight to it.

---

## 📂 Project Structure

```
📁 campus-management-system/
│
├── 📁 src/                      → All source code lives here
│   │
│   ├── 📁 entities/             → Core objects (the "things" in the system)
│   │   ├── Person.java          → Abstract base class (Student & Faculty inherit from this)
│   │   ├── Student.java         → Represents a student (inheritance + constructors)
│   │   ├── Faculty.java         → Represents a faculty member (inheritance)
│   │   └── Course.java          → Represents a course
│   │
│   ├── 📁 interfaces/           → Contracts that classes must follow
│   │   ├── Payable.java         → For anything that handles fee payments
│   │   └── Attendable.java      → For anything whose attendance is tracked
│   │
│   ├── 📁 services/             → Business logic / core operations
│   │   ├── EnrollmentService.java   → Handles enrolling & finding students
│   │   ├── FeeService.java          → Handles fee payments (implements Payable)
│   │   └── GradeCalculator.java     → Calculates grades (method overloading)
│   │
│   ├── 📁 exceptions/           → Custom error handling
│   │   ├── InvalidGradeException.java     → Thrown for invalid grade values
│   │   └── EnrollmentFullException.java   → Thrown when class capacity is full
│   │
│   ├── 📁 utils/                → Helper/utility classes
│   │   └── FileHandler.java     → Saves student records to a file
│   │
│   └── Main.java                → Entry point — runs the whole demo
│
├── README.md                    → Project documentation (you're reading it)
├── .gitignore                   → Files Git should ignore
└── LICENSE                      → MIT License
```

> Note: In a real-world project, each class (`Student`, `Faculty`, `Payable`, etc.) would live in its own file inside packages like `entities`, `interfaces`, `services`, and `exceptions`. Everything is merged into one file here for simplicity and easy sharing.

---

## 🖥️ Sample Output

```
========================================
 CAMPUS MANAGEMENT SYSTEM (OOP DEMO)
========================================

--- Demonstrating Runtime Polymorphism ---
Name: Aditi, Age: 19, Role: Student, ID: 1000, Course: B.Tech CSE (AI&ML), Fee Paid: Rs.0.0
Name: Rohan, Age: 20, Role: Student, ID: 1001, Course: B.Tech CSE (AI&ML), Fee Paid: Rs.0.0
Name: Dr. Sharma, Age: 45, Role: Faculty, Department: Computer Science, Salary: Rs.95000.0

Enrolled: Aditi (ID: 1000)
Enrolled: Rohan (ID: 1001)
Enrolled: Kavya (ID: 1002)
...
```

---

## 🛠️ Tech Stack

- **Language:** Java (JDK 8+)
- **Concepts:** Core OOP, Exception Handling, Collections, File I/O
- **Tools:** Any IDE (IntelliJ / Eclipse / VS Code) or plain terminal

---

## 📖 Why This Project?

This was built as part of my **AKTU CSE (AI & ML) 2nd Year** coursework to practically apply and revise Object-Oriented Programming concepts in Java, rather than just learning them theoretically.

---

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

---

## 🙋 Author


- GitHub: [@AnubhavSinghZ](https://github.com/AnubhavSinghZ)
- LinkedIn: [Anubhav Kumar Singh]

⭐ If you found this helpful, consider giving the repo a star!
