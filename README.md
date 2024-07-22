What is Encapsulation?
Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP). It aims to restrict direct access to an object's data and methods. By doing so, encapsulation enhances data security and improves the structure of the code. Encapsulation is achieved by making the object's variables private and providing public methods to access and manipulate these variables.

Benefits of Encapsulation
Security: Protects sensitive data from unauthorized modification.
Better Data Control: Allows data validation before setting values.
Flexibility: Implementation of internal methods can be changed without affecting external code.
Code Organization: Helps in logically organizing the code, making it easier to read and understand.
Error Reduction: Accessing data through methods reduces errors caused by direct access to variables.
-----------------------------
Explanation of the Example
Student Class: Contains private variables for name, ID,and age.
It provides public getter and setter methods to access and modify these variables, ensuring data validation(e.g., positive age).
Course Class: Contains private variables for course name, course code, and a list of students.
It provides methods to add students to the course and retrieve the list of students.
UniversitySystem Class: Demonstrates how to create student and course objects, add students to the course, and display course information along with the list of enrolled students.
Conclusion
Encapsulation in Java is not only for security but also for improving the structure of the code, making it easier to maintain and develop.
By using encapsulation, you can control how data is accessed and modified, leading to more stable and flexible code.






