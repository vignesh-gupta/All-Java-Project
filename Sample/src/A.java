import java.util.Scanner;

public class A{

  public static void main(String args[]) {
	  Scanner sc =new Scanner(System.in);
	  int n=sc.nextInt();
	  int ans=0;
	  int inc=0;
	  for(int i=1;i<=n;i++){
		 System.out.print(ans+",");
		 
		 ans+=inc+2;
		 inc++;
	  }

   }
  }