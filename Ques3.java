// Create an 2 dimensional array where its ask the user input number of students, number of exams, marks of student1, marks of student2 etc. , and calculate the grade of each student.

import java.util.Scanner;


/**
 * The public static function main() method is the entry point for the program.
 * It creates a Scanner object to read input from System.in, and then calls 
 * another public static function named processMarks(). The processMarks() 
 * function reads in data about students' exam scores, calculates each student's average score, and prints out their letter grade.
 
 *
 * @param oi Store the total marks of each student
 *
 * @return An array of ints
 *
 * @docauthor Trelent

/**
 * The public static function main() method is the entry point for the program.
 * It creates a Scanner object to read input from System.in, and then calls 
 * another public static function named processMarks(). The processMarks() 
 * function reads in data about students' exam scores, calculates each student's average score, and prints out their letter grade.
 
 *
 * @param oi Store the sum of marks for each student
 *
 * @return The average of the marks for each student
 *
 * @docauthor Trelent
 */ */public class Ques3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of students: ");
    int numOfStudents = sc.nextInt();

    System.out.print("Enter number of exams: ");
    int numOfExams = sc.nextInt();

    int[][] marks = new int[numOfStudents][numOfExams];

    for (int i = 0; i < numOfStudents; i++) {
      System.out.println("Enter marks for student " + (i + 1));
      for (int j = 0; j < numOfExams; j++) {
        marks[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < numOfStudents; i++) {
      int total = 0;
      for (int j = 0; j < numOfExams; j++) {
        total += marks[i][j];
      }
      int average = total / numOfExams;
      System.out.print("Student " + (i + 1) + ": ");
      if (average >= 90) {
        System.out.println("Grade A");
      } else if (average >= 80) {
        System.out.println("Grade B");
      } else if (average >= 70) {
        System.out.println("Grade C");
      } else if (average >= 60) {
        System.out.println("Grade D");
      } else {
        System.out.println("Grade F");
      }
    }
  }
}
