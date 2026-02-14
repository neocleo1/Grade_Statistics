package Grade_Stats;
import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double grade = 0.0;
		double sum = 0.0;
		double average = 0.0;
		double maximum = 0.0;
		double minimum = 100.0;
		
		System.out.println("Enter 10 grades:");
		
		for (int count = 1; count <= 10; count++) {
			System.out.print("Enter grade " + count + ": ");
			grade = input.nextDouble();
			
			while (grade < 0 || grade > 100) {
				System.out.print("Invalid grade. Please enter a grade between 0 and 100: ");
				grade = input.nextDouble();
			}
			
			sum = sum + grade;
			
			if (grade > maximum) {
				maximum = grade;
			}
			
			if (grade < minimum) {
				minimum = grade;
			}
		}
		
		average = sum / 10;
		
		System.out.println("\nGrade Statistics:");
		System.out.printf("Average: %.2f\n", average);
		System.out.printf("Maximum: %.2f\n", maximum);
		System.out.printf("Minimum: %.2f\n", minimum);
	}

}