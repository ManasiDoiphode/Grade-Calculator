# Grade Calculator

## Description
This Java program calculates and analyzes student grades. It allows users to enter student names and their respective grades, then calculates the average, highest, and lowest grades while categorizing them into letter grades (A, B, C, D, F).

## Features
- Allows input of multiple students and their grades.
- Calculates the average, highest, and lowest grade for each student.
- Categorizes the average grade into a letter grade.
- Provides input validation to ensure correct data entry.
- Displays a detailed report for each student.

## How to Run
### Prerequisites
- Java Development Kit (JDK) installed
- A command-line terminal (Command Prompt, Terminal, etc.)

### Steps
1. Copy the `StudentGradeCalculator.java` file into a directory on your computer.
2. Open a terminal and navigate to the directory where the file is saved.
3. Compile the Java program using:
   ```sh
   javac StudentGradeCalculator.java
   ```
4. Run the compiled program using:
   ```sh
   java StudentGradeCalculator
   ```
5. Follow the prompts to enter student names and grades.
6. Type `exit` to stop adding students and display reports.

## Example Usage
```
Enter student name (or type 'exit' to finish): John Doe
Enter the number of grades: 3
Enter grade 1: 85
Enter grade 2: 92
Enter grade 3: 78

Enter student name (or type 'exit' to finish): Jane Smith
Enter the number of grades: 2
Enter grade 1: 95
Enter grade 2: 88

Enter student name (or type 'exit' to finish): exit

Student Reports:
Student: John Doe
Grades: [85.0, 92.0, 78.0]
Average Grade: 85.00
Highest Grade: 92.0
Lowest Grade: 78.0
Grade Category: B

Student: Jane Smith
Grades: [95.0, 88.0]
Average Grade: 91.50
Highest Grade: 95.0
Lowest Grade: 88.0
Grade Category: A
```

## Code Explanation
- The `Student` class stores student names and grades and provides methods to compute:
  - The average grade.
  - The highest and lowest grades.
  - The letter grade category.
- The program continuously prompts the user to enter student names and their grades.
- Grades are validated to ensure they are numeric and within the 0-100 range.
- After input, student reports are displayed.

## Future Enhancements
- Add functionality to store student records in a file.
- Implement a GUI version for better user experience.
- Allow users to update or delete student records.

## License
This project is open-source and available for personal and educational use.

