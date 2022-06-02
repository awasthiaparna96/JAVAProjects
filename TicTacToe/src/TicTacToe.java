import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	static ArrayList<Integer> playerPosition = new ArrayList<>();
	static ArrayList<Integer> compPosition = new ArrayList<>();

	public static void main(String[] args) {

		char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

		printGameBoard(gameBoard);

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the placement(1-9):");
			int userPos = scan.nextInt();
			System.out.println(userPos);

			while (playerPosition.contains(userPos)
					|| compPosition.contains(userPos)) {
				System.out.println("Enter a correct position");
				userPos = scan.nextInt();
			}

			makeYourMove(gameBoard, userPos, "user");

			String result = winningMove();
			
			if (result.length() > 0) {
				System.out.println(result);
				printGameBoard(gameBoard);
				break;
			}

			Random rand = new Random();
			int compPos = rand.nextInt(9) + 1;
			while (playerPosition.contains(compPos)
					|| compPosition.contains(compPos)) {
				compPos = rand.nextInt(9) + 1;
			}

			makeYourMove(gameBoard, compPos, "computer");

			printGameBoard(gameBoard);

			result = winningMove();

			if (result.length() > 0) {
				System.out.println(result);
				printGameBoard(gameBoard);
				break;
			}
		}

	}

	public static void printGameBoard(char[][] gameBoard) {
		for (char[] row : gameBoard) {
			for (char element : row) {
				System.out.print(element);
			}
			System.out.println();
		}
	}

	public static void makeYourMove(char[][] gameBoard, int pos, String player) {
		char symbol = ' ';
		if (player.equals("user")) {
			symbol = 'X';
			playerPosition.add(pos);
		} else if (player.equals("computer")) {
			symbol = 'O';
			compPosition.add(pos);
		}
		switch (pos) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
		default:
			break;

		}

	}

	public static String winningMove() {

		List topRow = Arrays.asList(1, 2, 3);
		List midRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(7, 8, 9);
		List firstCol = Arrays.asList(1, 4, 7);
		List midCol = Arrays.asList(2, 5, 8);
		List lastCol = Arrays.asList(3, 6, 9);
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(3, 5, 7);

		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(firstCol);
		winning.add(midCol);
		winning.add(lastCol);
		winning.add(cross1);
		winning.add(cross2);

		for (List l : winning) {
			if (playerPosition.containsAll(l)) {
				return "You have won";

			} else if (compPosition.containsAll(l)) {
				return "You lost";
			} else if (playerPosition.size() + compPosition.size() == 9) {
				return "Tie";
			}
		}

		return "";
	}
}
