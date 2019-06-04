import java.util.Scanner;
class Main{
  public static int sum(int a){
    int sum=0;
    while(a!=0)
    {
      
	sum=sum+a;
      a--;
    }
    return sum;
  }
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int s=sum(a);
      System.out.println(s);
	}
}