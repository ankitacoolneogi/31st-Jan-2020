import java.util.Scanner;
import java.util.StringTokenizer;

class LineOfIntUsingTokenizer{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0, item;
		//StringBuilder str = new StringBuilder(sc.nextLine());
		System.out.print("Enter a line of integers:  ");
		StringTokenizer stoken = new StringTokenizer(sc.nextLine()," ");
		System.out.println("The individual numbers are: ");
		while(stoken.hasMoreTokens()){
			item = Integer.parseInt(stoken.nextToken());
			System.out.println(item);
			sum += item;
		}
		System.out.println("the sum of the enetered numbers are: " + sum);
	}
}