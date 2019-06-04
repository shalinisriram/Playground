import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code 
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int gret=g(n1,n2,n3);
      System.out.println(gret);
    }
  public static int g(int n1,int n2,int n3){
    int gre;
    if((n1>n2)&&(n1>n3))
    {
       gre=n1;
    }
    else if(n2>n3)
       {
         gre=n2;
       }
    else{
         gre=n3;
       }
   return gre;
       }
 


	
}