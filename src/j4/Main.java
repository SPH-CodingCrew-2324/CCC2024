package j4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String original = in.nextLine();
		String changed = in.nextLine();
		char silly = 0, quiet = 0, newSilly = 0;
		if (original.length() == changed.length()) {
			quiet = '-';
		}
		int pos = 0;
		for (int x = 0; x < original.length(); x++) {
			if (silly != 0 && quiet != 0) {
				break;
			}
			char letter = original.charAt(x);
			if (pos>=changed.length()) {
				if (quiet==0) {
					quiet=letter;
					break;
				}else {
					break;
				}
			}
			char checkLetter = changed.charAt(pos);
			if (letter == checkLetter) {
				pos++;
				continue;
			} else {
				// check if it's equal to the silent
				if (letter == quiet) {
					continue;
				}
				// check if it's equal to the silly
				if (letter == silly && checkLetter == newSilly) {
					pos++;
					continue;
				}
				// check if this letter is a quiet potential.
				// The next letter is the current letter in the new string
				if (x < original.length() - 1 && original.charAt(x + 1) == checkLetter) {
					quiet = letter;
					continue;
				}

				// check if this could be silly
				if (x < original.length() - 1 && original.charAt(x + 1) != checkLetter) {
					silly = letter;
					newSilly = checkLetter;
					pos++;
					continue;
				}
				// check if we're at the end of the string, is it silly or silent?
				if (x == original.length() - 1) {
					if (silly == 0) {
						silly = letter;
						newSilly = checkLetter;
						continue;
					} else {
						quiet = letter;
						continue;
					}

				}
			}
		}
		System.out.println(silly + " " + newSilly + "\n" + quiet);
	}

}
