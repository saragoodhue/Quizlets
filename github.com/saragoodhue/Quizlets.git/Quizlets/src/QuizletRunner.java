import java.util.ArrayList;
import java.util.Scanner;

public class QuizletRunner
	{

		static ArrayList<Quizlet> flashcards = new ArrayList<Quizlet>();
		public static int numOfCards;
		public static String term;
		static String definition;
		static int menuAnswer;
		static Scanner scanner = new Scanner(System.in);

		public static void main(String[] args)
			{
				setUp();
				menu();
			}

		public static void setUp()
			{
				
				System.out.println("This is a program similar to quizlet. You will enter a term and a definition.");
				System.out.println();
				System.out.println("How many flashcards do you want to make?");
				
				numOfCards = scanner.nextInt();
				System.out.println("You now will input your flashcards.");
				System.out.println();
				scanner.nextLine();

				for (int i = 0; i <= numOfCards - 1; i++)
					{
						System.out.println("Enter the term:");
						term = scanner.nextLine();
						System.out.println("Enter the definition:");
						definition = scanner.nextLine();
						flashcards.add(new Quizlet(term, definition));
					}
			}

		public static void menu()
			{
				System.out.println("You now have the option to do:");
				System.out.println("(1) flashcards");
				System.out.println("(2) a quiz");
				System.out.println("(3) match the cards");
				menuAnswer = scanner.nextInt();
				
				if(menuAnswer == 1) {
					Flashcards.studyFlashcards();
					
				}
				if(menuAnswer == 2) {
					Quiz.quizFlashcards();
				}
				if(menuAnswer == 3) {
					Matching.match();
					
				}
				
			}

	}
