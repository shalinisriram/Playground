import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      

  Scanner s=new Scanner(System.in) ;
      int n=s.nextInt();
      int sum=0;
      int a[]=new int[5]; 
      for(int i=0;i<n;i++){
        a[i]=s.nextInt();
      }
      int v=s.nextInt();
      for(int i=0;i<n;i++)
      {
       for(int j=i+1;j<n;j++)
       {
         sum=a[i]+a[j];
         if(v==sum)
         {
           System.out.println(a[i]+","+" "+a[j]);
         }
         
       }
      
      }
    }
}