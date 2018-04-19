import java.util.Scanner;
import java.util.Date;

public class AnanthkarTTT{
	public static void main(String[] args){

		Scanner reader = new Scanner (System.in);


// This in array is drawing up the board lines. In (xstart, ystart, xend, yend) format
		int[][]boardLine = {{0,200,600,200},
							 {0,400,600,400},
							 {200,0,200,600},
							 {400,0,400,600}};
// This sets up the array that will be used to set up the X/O grid. They are temporarily filled with hyphens until they are fiflled with x and o values.
		char [][]arr = new char[3][3];
		for (int i=0;i<3;i++)
			for (int j=0;j<3;j++)
				arr[i][j]='-';





// This line imports the TicTacToeBoard file
		TicTacToeBoard board = new TicTacToeBoard(620,720);








// This sets up the grid given the lines you provided above in the boardLine array
		board.defineBoard(boardLine);
// This will set your pictures to display for the x and o values. Make sure your names match exactly what you type in the parameters.
		board.setFiles("croppedX.png","Cyrillic-O.png");
// This sets up the spacing and place values for x and o
		board.setBoard(arr);
// This will refresh the board so that new elements will display.
		board.repaint();


	boolean usertry = false;
	boolean user2try = false;
	boolean comptry = false;
	boolean winner = false;
	boolean notvalid = false;
	boolean responsevalid = false;

	int tie = 0;
	String response = "";



	System.out.println(" !!! WELCOME TO TIC_TAC_TOE WITH ME !!!\nI have set the board up as Row(0)(1)(2) and Column(0)(1)(2).");
	System.out.println();





	do{
		System.out.println("One or Two Players?\nIf One Player enter (One Player), if Two Players enter (Two Players)");
		response = reader.nextLine();

		System.out.println();


		if ((response.equals("One Player"))||(response.equals("Two Players"))){
					responsevalid = true;
		}


		else {
			System.out.println("ERROR : NOT A VALID GAME PLAY");
			System.out.println();
			responsevalid = false;
		}



	}while(responsevalid == false);



		if (response.equals("One Player")){

				System.out.println("You are X and Computer is O");
				System.out.println();



	//Re loop
		do{

			do {



					System.out.println("Enter what row you want");
					int row = reader.nextInt();

					System.out.println("Enter what column you want");
					int column = reader.nextInt();


					if ((row > 2 || row < 0) || (column > 2 || column < 0) ){
						usertry = false;
						System.out.println();
						System.out.println("Not Valid enter again");
						System.out.println();
					}
					else if(arr[row][column] == '-'){
						arr[row][column] = 'x';
						usertry = true;
						tie++;
					}
					else{
						usertry = false;
						System.out.println("That spot is invalid");
						System.out.println();

					}
					board.repaint();

			}while (usertry == false);



				// Check WINNER for X

				if(arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x' ){

						System.out.println("X WINS");
						board.setWinner("X WINS", 130, 660, 55);
						board.showText(true);
						board.repaint();
						winner = true;
						break;

				}

				else if(arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x' ){

						System.out.println("X WINS");
						board.setWinner("X WINS", 130, 660, 55);
						board.showText(true);
						board.repaint();
						winner = true;
						break;

				}

				else if(arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x' ){

						System.out.println("X WINS");
						board.setWinner("X WINS", 130, 660, 55);
						board.showText(true);
						board.repaint();
						winner = true;
						break;

				}

				else if(arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x' ){

						System.out.println("X WINS");
						board.setWinner("X WINS", 130, 660, 55);
						board.showText(true);
						board.repaint();
						winner = true;
						break;

				}

				else if(arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x' ){

						System.out.println("X WINS");
						board.setWinner("X WINS", 130, 660, 55);
						board.showText(true);
						board.repaint();
						winner = true;
						break;

				}

				else if(arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x' ){

						System.out.println("X WINS");
						board.setWinner("X WINS", 130, 660, 55);
						board.showText(true);
						board.repaint();
						winner = true;
						break;

				}
				else if(arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x' ){

						System.out.println("X WINS");
						board.setWinner("X WINS", 130, 660, 55);
						board.showText(true);
						board.repaint();
						winner = true;
						break;

				}

				else if(arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x' ){

						System.out.println("X WINS");
						board.setWinner("X WINS", 130, 660, 55);
						board.showText(true);
						board.repaint();
						winner = true;
						break;

				}

				if (tie == 9){

						System.out.println("IT'S A TIE");
						board.setWinner("IT'S A TIE", 130, 660, 55);
						board.showText(true);
						board.repaint();
						break;


						}



				System.out.println("Computer's Turn");




						board.delay(1000);


				do{
				int x = (int)(Math.random()*3)+0;
				int y = (int)(Math.random()*3)+0;

					if(arr[x][y] == '-'){
						arr[x][y] = 'o';
							comptry = true;
							tie++;
					}
					else{
						comptry = false;
					}

					board.repaint();

				}while(comptry == false);


		// Check WINNER for O

			if(arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o' ){

					System.out.println("COMPUTER WINS");
					board.setWinner("COMPUTER WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}

			else if(arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o' ){

					System.out.println("COMPUTER WINS");
					board.setWinner("COMPUTER WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}

			else if(arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o' ){

					System.out.println("COMPUTER WINS");
					board.setWinner("COMPUTER WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}

			else if(arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o' ){

					System.out.println("COMPUTER WINS");
					board.setWinner("COMPUTER WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}

			else if(arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o' ){

					System.out.println("COMPUTER WINS");
					board.setWinner("COMPUTER WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}

			else if(arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o' ){

					System.out.println("COMPUTER WINS");
					board.setWinner("COMPUTER WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}
			else if(arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o' ){

					System.out.println("COMPUTER WINS");
					board.setWinner("COMPUTER WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

			}

			else if(arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o' ){

					System.out.println("COMPUTER WINS");
					board.setWinner("COMPUTER WINS", 130, 660, 55);
					board.showText(true);
					board.repaint();
					winner = true;
					break;

				}


			if (tie == 9){
				System.out.println("IT'S A TIE");
				board.setWinner("IT'S A TIE", 130, 660, 55);
				board.showText(true);
				board.repaint();
				break;


			}





		}while (winner == false);
	}





	else{


		System.out.println();

		System.out.println("You are Player 1 [X] and Player 2 is [O]");



			//Re loop
				do{

						do {

						System.out.println();

						System.out.println("Player 1's Turn: \nEnter what row you want");
						int row = reader.nextInt();

						System.out.println("Enter what column you want");
						int column = reader.nextInt();



						if ((row > 2 || row < 0) || (column > 2 || column < 0) ){

							usertry = false;
							System.out.println();
							System.out.println("Not Valid enter again");
							System.out.println();
						}
						else if(arr[row][column] == '-'){
							arr[row][column] = 'x';
							usertry = true;
							tie++;
						}
						else{
							usertry = false;
							System.out.println("That spot is invalid");
							System.out.println();

						}
					board.repaint();

					}while (usertry == false);



						// Check WINNER for X

						if(arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x' ){

								System.out.println("X WINS");
								board.setWinner("X WINS", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						else if(arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x' ){

								System.out.println("X WINS");
								board.setWinner("X WINS", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						else if(arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x' ){

								System.out.println("X WINS");
								board.setWinner("X WINS", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						else if(arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x' ){

								System.out.println("X WINS");
								board.setWinner("X WINS", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						else if(arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x' ){

								System.out.println("X WINS");
								board.setWinner("X WINS", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						else if(arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x' ){

								System.out.println("X WINS");
								board.setWinner("X WINS", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}
						else if(arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x' ){

								System.out.println("X WINS");
								board.setWinner("X WINS", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						else if(arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x' ){

								System.out.println("X WINS");
								board.setWinner("X WINS", 130, 660, 55);
								board.showText(true);
								board.repaint();
								winner = true;
								break;

						}

						if (tie == 9){

								System.out.println("IT'S A TIE");
								board.setWinner("IT'S A TIE", 130, 660, 55);
								board.showText(true);
								board.repaint();
								break;


						}



						do {

						System.out.println();

						System.out.println("Player 2's Turn: \nEnter what row you want");
						int row = reader.nextInt();

						System.out.println("Enter what column you want");
						int column = reader.nextInt();



						if ((row > 2 || row < 0) || (column > 2 || column < 0) ){
							user2try = false;
							System.out.println();
							System.out.println("Not Valid enter again");
							System.out.println();
						}
						else if(arr[row][column] == '-'){
							arr[row][column] = 'o';
							user2try = true;
							tie++;
						}
						else{
							user2try = false;
							System.out.println();
							System.out.println("That spot is invalid");
							System.out.println();

						}
					board.repaint();

					}while (user2try == false);


				// Check WINNER for O

					if(arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o' ){

							System.out.println("PLAYER 2 WINS");
							board.setWinner("PLAYER 2 WINS", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}

					else if(arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o' ){

							System.out.println("PLAYER 2 WINS");
							board.setWinner("PLAYER 2 WINS", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}

					else if(arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o' ){

							System.out.println("PLAYER 2 WINS");
							board.setWinner("PLAYER 2 WINS", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}

					else if(arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o' ){

							System.out.println("PLAYER 2 WINS");
							board.setWinner("PLAYER 2 WINS", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}

					else if(arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o' ){

							System.out.println("PLAYER 2 WINS");
							board.setWinner("PLAYER 2 WINS", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}

					else if(arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o' ){

							System.out.println("PLAYER 2 WINS");
							board.setWinner("PLAYER 2 WINS", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}
					else if(arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o' ){

							System.out.println("PLAYER 2 WINS");
							board.setWinner("PLAYER 2 WINS", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

					}

					else if(arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o' ){

							System.out.println("PLAYER 2 WINS");
							board.setWinner("PLAYER 2 WINS", 130, 660, 55);
							board.showText(true);
							board.repaint();
							winner = true;
							break;

						}



					if (tie == 9){
							System.out.println("IT'S A TIE");
							board.setWinner("IT'S A TIE", 130, 660, 55);
							board.showText(true);
							board.repaint();
							break;


						}







				}while (winner == false);

	}
















	}
	}


