package j3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> scores = new HashSet<>();
		ArrayList<Integer> values = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int x=0;x<N;x++) {
			int next=in.nextInt();
			scores.add(next);
			values.add(next);
		}
		Integer[] scoreSet=new Integer[scores.size()];
		scores.toArray(scoreSet);
		Arrays.sort(scoreSet);
		int bronze = scoreSet[scoreSet.length-3];
		Collections.sort(values);
		int start = values.indexOf(bronze);
		int finish = values.lastIndexOf(bronze);
		int count = finish-start+1;
		System.out.println(bronze+" "+count);
	}

}
