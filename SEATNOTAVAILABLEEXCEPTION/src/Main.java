import java.util.*;
public class Main
{
    public static void main(String [] args)throws SeatNotAvailableException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the show:");
        int rnc = sc.nextInt();
        System.out.println("Enter the number of seats to be booked:");
        int booking = sc.nextInt();
        int arr[][] = new int[rnc][rnc];
   
        int l;
        int arr1d[] = new int[rnc*rnc];
        for(int i=1 ; i<=booking ; i++)
        {
            System.out.println("Enter the seat number "+i);
            l=sc.nextInt();
            try{
            if(arr1d[l]==1)
                throw new  SeatNotAvailableException("Already Booked");
            arr1d[l] = 1;
            }
            catch(ArrayIndexOutOfBoundsException ae)
            {
                System.out.println(ae);
                break;
            }
            catch(SeatNotAvailableException e)
            {
                System.out.println(e);
                break;
            }
           
        }
        System.out.println("The seats booked are:");
        int k=0;
        for(int i=0 ; i<rnc ; i++)
        {
        	for(int j=0; j<rnc ; j++)
        	{
        		arr[i][j]=arr1d[k];
        		k++;
        	}
        }
        for(int i=0 ; i<rnc ; i++)
        {
        	for(int j=0; j<rnc ; j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        sc.close();
    }	
}