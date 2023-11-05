

	import java.util.Scanner;

	public class StudentGradeCalculator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the number of subjects: ");
	        int Subjects = sc.nextInt();

	        double total= 0.0;

	        for (int i = 1; i <= Subjects; i++) 
	        {
	            System.out.print("Enter the marks for subject " + i + ": ");
	            double marks = sc.nextDouble();
	            total += marks;
	        }

	        double avg = total/ Subjects;
	        System.out.println("Total marks: "+total);
	        System.out.println("avg percentage: "+avg+"%");
	        
	        char grade;
	        if (avg >= 90) 
	        {
	            grade = 'A';
	        }
	        else if (avg >= 80) 
	        {
	            grade = 'B';
	        } 
	        else if (avg >= 70) 
	        {
	            grade = 'C';
	        }
	        else if (avg >= 60) 
	        {
	            grade = 'D';
	        }
	        else
	        {
	            grade = 'F';
	        }

	        
	        System.out.println("Letter Grade: " + grade);

	       
	    }
	}



