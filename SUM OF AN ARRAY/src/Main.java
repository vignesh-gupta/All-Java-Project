import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n :");
		int sum = 0;
		int length = sc.nextInt();
		int[] arr = new int[length];
		if(length<=15)
		{
			for(int num=0 ; num<arr.length ; num++){
			    arr[num] = sc.nextInt();
			 }
			
			for(int i: arr){
			    sum=sum+i;
			 }
			System.out.println("Sum of array elements is : "+sum);
		}
		
		sc.close();
	}

}
