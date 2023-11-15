import java.util.Scanner;
import java.util.Random;

public class GuesstheNumber {

	public static void main(string[] args) {

		Scanner src=new Scanner(System.in);
		Random rand=new Random;


		int low=10;
		int upper=100;
		int generatedNum=rand.nextInt(upper-lower+1)+low;
		int maxAttempts=10;
		int score=0;


		System.out.println("------------------------");
		System.out.println("Welcome to number guessing game:----");
		System.out.println("Try to guess the number between "+low+"  and " +upper);
		for(int a=1;a<=maxAttempts;a++) {

			Systemout.println("Attempt:"+a+" Enter your guess:");
			int userGuess=src.nextInt();
			
			if(userGuess==generatedNum) {

				System.out.println("Congratulations!.... You guessed the number..");
				score+=maxAttempts-(a-1);
				break;
			}

			else if(userGuess < generatedNum) {

				System.out.println("Too low,,, try again");
			}

			else {

				System.out.println("Too high.... Try again.....");	
			}

			if(a==maxAttempts) {

				System.out.println("Sorry you have reached the max number of attempts..The correct number was "+generatedNum);
			}
		}

		System.out.println("Your score : "+score);

		src.close();
	}
}