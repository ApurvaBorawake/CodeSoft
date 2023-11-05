
import java.util.Scanner;
import java.util.Random;

public class NumberGame 
{
		    public static void main(String[] args)
		    {
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        
		        int minno = 1;
		        int maxno = 100;
		        int attempts = 10;
		        int score=0;
		        
		        System.out.println("Welcome to the Number Guessing Game!");
		        System.out.println("I have selected a random number between " + minno + " and " + maxno + ". Try to guess it!");
		        
		        boolean playagain=true;
		        while (playagain)
		        {
		        	int targetno=random.nextInt(maxno-minno+1) +minno;
		        	int attempt1=0;
		        	while(attempt1<attempts)
		        	{
		            System.out.print("Enter your guess: ");
		            int user = scanner.nextInt();
		            attempts++;
		            
		            if (user < minno || user > maxno)
		            {
		                System.out.println("Please enter a number between " + minno + " and " + maxno + ".");
		            }
		            else if (user <targetno) 
		            {
		                System.out.println("Too low! Try again.");
		            } else if(user >targetno ) 
		            {
		                System.out.println("Too high! Try again.");
		            } 
		            else
		            {
		            	
		            	System.out.println("congratulations! you guessed the no in"+attempts+"attemtps.");
		        	break;
		            }
		            
		        }
		        
		        scanner.close();
		    }
		}


	}


