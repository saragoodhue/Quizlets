import java.util.Scanner;
//import quizlet.quizletRunner;

public class Flashcards
	{

			static double counterRight;
			static double counterWrong;
			static double grade;

				public static void studyFlashcards()
					{
					
						Scanner input = new Scanner(System.in);
						System.out.println("Do you want to review with the Term or Definition?");
						String choice;
						choice = input.nextLine();

						if (!choice.equals("Term") && !choice.equals("Definition"))
							{
								System.out.println("Not a valid entry, enter Term or Definition");
								choice = input.nextLine();
							}
						
						if (choice.equals("Term"))
							{
								for(int i = 0; i < QuizletRunner.numOfCards; i++)
									{
										System.out.println();
										System.out.println(QuizletRunner.flashcards.get(i).getTerm());
										System.out.println("What is the definition?");
										Scanner def = new Scanner(System.in);
										String userDef;
										userDef = def.nextLine();
										
										if(!userDef.equals(QuizletRunner.flashcards.get(i).getDefinition()))
											{
												System.out.println("Sorry, that is not the definition you entered!");
												counterWrong++;
												grade = counterRight/(counterWrong + counterRight)*100;
												System.out.println("Your percent of correct responses is: ");
												System.out.printf("%.2f", grade);
												System.out.print("%");
											}
										
										else if(userDef.equals(QuizletRunner.flashcards.get(i).getDefinition()))
											{
												System.out.println("You got it!");
												counterRight++;
												grade = counterRight/(counterWrong + counterRight)*100;
												System.out.println("Your percent of correct responses is: ");
												System.out.printf("%.2f", grade);
												System.out.println("%");
											}
										
									}

								QuizletRunner.menu();

							}

						else if (choice.equals("Definition"))
						
								for(int i = 0; i < QuizletRunner.numOfCards; i++)
									{
										System.out.println();
										System.out.println(QuizletRunner.flashcards.get(i).getDefinition());
										System.out.println("What is the term?");
										Scanner term = new Scanner(System.in);
										String userTerm;
										userTerm = term.nextLine();
										
										if(!userTerm.equals(QuizletRunner.flashcards.get(i).getTerm()))								
											{
												System.out.println("Sorry, that is not the definition you entered!");
												counterWrong++;
												grade = counterRight/(counterWrong + counterRight)*100;
												System.out.println("Your percent of correct responses is: ");
												System.out.printf("%.2f", grade);
												System.out.print("%");
											}
										
										else if(userTerm.equals(QuizletRunner.flashcards.get(i).getTerm()))
											{
												System.out.println("You got it!");
												counterRight++;
												grade = counterRight/(counterWrong + counterRight)*100;
												System.out.println("Your percent of correct responses is: ");
												System.out.printf("%.2f", grade);
												System.out.println("%");
											}
									}
								QuizletRunner.menu();

							}

					}

			
