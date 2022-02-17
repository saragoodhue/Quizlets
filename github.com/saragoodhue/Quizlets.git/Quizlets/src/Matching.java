import java.util.ArrayList;
import java.util.Collections;


public class Matching
	{
		static int index;
		public static void match()
			{
				System.out.println("Match the term with its definition");
				int[] indexArray = new int[QuizletRunner.numOfCards];
				
				Collections.shuffle(QuizletRunner.flashcards);
				int number = 1;
				
				for(Quizlet q : QuizletRunner.flashcards)
					{	
						System.out.print(number + ". ");
						System.out.println(q.getTerm());
						number++;

					}

			}

	}
