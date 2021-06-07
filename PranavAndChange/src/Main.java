import java.util.*;

 

public class Main{ 

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int note[]=new int[6];
        note[0]=100;
        note[1]=50;
        note[2]=10;
        note[3]=5;
        note[4]=2;
        note[5]=1;
        int minNum=n;
        int count=0;
        
        for(int element:note)
        {
            int notes=0;
            if(n%element==0)
            {
                ++count;
                notes=n/10;
                if(notes<minNum)
                {
                    minNum=notes;
                }
            }
        }
        
        int sumNotes=0;

 

        for(int i=0;i<note.length;i++)
        {
            sumNotes=sumNotes+n/note[i];
            n=n%note[i];
        }
        
        if(count==0)
        {
            System.out.println(minNum);
        }
        else if(count>0)
        {
            System.out.println(sumNotes);
        }
        sc.close();
    }
    
}