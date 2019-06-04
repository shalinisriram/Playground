import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
     
      int f=n/100;
      int m=n%10;
      int sum =f+m;
      System.out.println(sum);
		// Type your code here
	}
}