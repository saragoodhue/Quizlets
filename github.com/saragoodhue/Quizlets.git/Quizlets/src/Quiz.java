import java.util.Scanner;
public class Quiz
	{

		//hehe
				static Scanner scanner = new Scanner(System.in);
				static int numOfMulChoice;
				static int numOfTF;
				static int numOfWriting;
				
				static String userAnswer;
				public static void quizFlashcards() {
					int randomNum1 = (int) (Math.random() * 3) + 1;
					int randomNum2 = (int) (Math.random() * 3) + 1;
					int randomNum3 = (int) (Math.random() * 3) + 1;
					int randomNum4 = (int) (Math.random() * 3) + 1;
					
					System.out.println("Out of the " + QuizletRunner.numOfCards + " flashcards, how many cards do you want to be multiple choce questions?");
					System.out.println();
					numOfMulChoice = scanner.nextInt();
					System.out.println("How many cards do you want to be true or false?");
					numOfTF = scanner.nextInt();
					System.out.println("How many cards do you want to be writing?");
					System.out.println();
					numOfWriting = scanner.nextInt();
					
					if(numOfMulChoice + numOfTF + numOfWriting > QuizletRunner.numOfCards) {
						System.out.println("You went over the amount of cards that you made, try again.");
						quizFlashcards();
					}

					if(numOfMulChoice > 0) {
						for(int i = 0; i <= numOfMulChoice; i++) {
							System.out.println(QuizletRunner.flashcards.get(i).getDefinition());
							System.out.println();
							System.out.println("a." + QuizletRunner.flashcards.get(randomNum1).getTerm());
							System.out.println("b." + QuizletRunner.flashcards.get(randomNum2).getTerm());
							System.out.println("c." + QuizletRunner.flashcards.get(randomNum3).getTerm());
							System.out.println("d." + QuizletRunner.flashcards.get(randomNum4).getTerm());
							
							userAnswer = scanner.nextLine();
						}
					}
				}
	}

			

	
