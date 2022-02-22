import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Matching
	{
		static int index;
		public static void match()
			{
				System.out.println();
				System.out.println("Match the term with its definition");
				String[] indexDef = new String[QuizletRunner.numOfCards];
				
				
				Collections.shuffle(QuizletRunner.flashcards);
				int number = 1;
				System.out.println();
				System.out.println("Here is a list of Terms you entered in random order:");
				
				for(Quizlet q : QuizletRunner.flashcards)
					{	
						System.out.print(number + ". ");
						System.out.println(q.getTerm());
						number++;

					}
				
				System.out.println();
				System.out.println("Here is a list of Definitions you entered in random order:");
				Collections.shuffle(QuizletRunner.flashcards);
				number = 1;
				for(Quizlet s : QuizletRunner.flashcards)
					{
						System.out.print((number) + ". ");
						System.out.println(s.getDefinition());
						indexDef[number - 1] = s.getDefinition();
						number+=1;
						
					}
				
				for(int i = 0; i < QuizletRunner.numOfCards; i++)
					{
						System.out.println();
						System.out.println("What is the number of the defintion for Term " + (i + 1));
						Scanner match = new Scanner(System.in);
						int matches = match.nextInt();
						//String matchDef = indexDef[matches];
						
						if((indexDef[matches - 1]).equals(QuizletRunner.flashcards.get(i).getDefinition()))
							{
								System.out.println("That definition matches!");
								System.out.println();
							}
						
						else
							{
								System.out.println("That is not the right definition");
								System.out.println();
							}
					}
				
				QuizletRunner.menu();

			}

	}
