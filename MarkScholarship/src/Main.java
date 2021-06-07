
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int marks[]=new int[5];
	for (int i=1;i<=5;i++){
		System.out.println("Enter the subject "+i+" mark");
		marks[i-1]=sc.nextInt();
	}
	int full=0,sum=0,fail=0,avg=0;
	
	for (int i=0;i<5;i++){
		sum+=marks[i];
		if(marks[i]==5){
			full++;
		}
		if (marks[i]<=2) {
			fail++;
		}
	}
	
	avg=sum/5;
	if(full>=1 && fail==0 && avg>=4){
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	sc.close();
}
}