
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int R = in.nextInt();
		int G = in.nextInt();
		int B = in.nextInt();
		int C = R*3+G*4+B*5;
		System.out.println(C);
		in.close();
//		System.out.println(in.nextInt()*3+in.nextInt()*4+in.nextInt()*5);
	}

}
