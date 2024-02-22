package j2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int D = in.nextInt();
		boolean eat;
		do {
			eat=false;
			int Y = in.nextInt();
			if (D>Y) {
				eat=true;
				D+=Y;
			}
		}while (eat);
		System.out.println(D);
	}

}
