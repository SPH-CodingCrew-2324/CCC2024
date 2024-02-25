package j5;

import java.util.*;

public class Main {

	public static ArrayList<Integer[]> visited=new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int score = 0;
		int R = Integer.parseInt(in.nextLine());
		int C = Integer.parseInt(in.nextLine());
		String[][] field = new String[R][C];
		// read in the field
		for (int x = 0; x < R; x++) {
			String l = in.nextLine();
			for (int y = 0; y < C; y++) {
				field[x][y] = l.substring(y, y + 1);
			}
		}
		int fRow = Integer.parseInt(in.nextLine());
		int fCol = Integer.parseInt(in.nextLine());
		score = checkField(fRow, fCol, field);
		System.out.println(score);
	}

	public static int checkField(int row, int col, String[][] field) {
		int score = 0;
		if (field[row][col].length()>1) {
			return score;
		}
		
		// add current val
		switch (field[row][col]) {
		case "L":
			score += 10;
			field[row][col]+="x";
			break;

		case "M":
			score += 5;
			field[row][col]+="x";
			break;
		case "S":
			score += 1;
			field[row][col]+="x";
			break;

		default:
			// if not a pumpkin, return
			score = 0;
			field[row][col]+="x";
			return score;

		}
		// check left
		if (col > 0) {
			if (!field[row][col-1].equals("*") && field[row][col-1].length()==1) {
				score += checkField(row, col - 1, field);
			}
		}
		// check up
		if (row > 0) {
			if (!field[row-1][col].equals("*") && field[row-1][col].length()==1) {
				score += checkField(row - 1, col, field);
			}
		}
		// check right
		if (col < field[row].length - 1) {
			if (!field[row][col+1].equals("*") && field[row][col+1].length()==1) {
				score += checkField(row, col + 1, field);
			}
		}
		// check down
		if (row < field.length - 1) {
			if (!field[row+1][col].equals("*") && field[row+1][col].length()==1) {
				score += checkField(row + 1, col, field);
			}
		}
		return score;
	}

}
