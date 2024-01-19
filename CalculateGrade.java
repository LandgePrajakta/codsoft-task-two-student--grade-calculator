package student_grade_calculator_task;

import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total number of subjects:");
		int numberOfSubjects = sc.nextInt();
		int[] subjectMarks = new int[numberOfSubjects]; // array to store marks obtained in each subject.

		for (int i = 0; i < numberOfSubjects; i++) {
			System.out.print("\nEnter marks for Subject " + (i + 1) + ": ");
			subjectMarks[i] = sc.nextInt();

			while (subjectMarks[i] < 0 || subjectMarks[i] > 100) {
				System.out.println("Invalid marks. Marks should be between 0 and 100.");
				System.out.print("Enter marks for subject " + (i + 1) + " again: ");
				subjectMarks[i] = sc.nextInt();
			}
		}

		int totalMarks = 0;
		for (int marks : subjectMarks) { // total marks calculation
			totalMarks += marks;
		}

		double averagePercentage = (double) totalMarks / numberOfSubjects; // average percentage calculation
		char grade = gradeCalculation(averagePercentage);

		System.out.println("\nResult:"); // Display result
		System.out.println("Total Marks obtained: " + totalMarks);
		System.out.println("Average Percentage obtained: " + averagePercentage + "%");
		System.out.println("Grade: " + grade);

		sc.close();
	}

	private static char gradeCalculation(double averagePercentage) {
		if (averagePercentage >= 90) {
			return 'A';
		} else if (averagePercentage >= 80) {
			return 'B';
		} else if (averagePercentage >= 70) {
			return 'C';
		} else if (averagePercentage >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
}
