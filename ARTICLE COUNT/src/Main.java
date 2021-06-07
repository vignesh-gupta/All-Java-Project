import java.util.*;

public class Main 
{
    public static void main(String[] args) throws Exception
    {        
        Scanner sc=new Scanner(System.in);
        
        int count=0;
        
        System.out.println("Enter the number of lines");
        int n=sc.nextInt();
        sc.nextLine();
        
        Article a;
        
        ArrayList <Article> al=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {  
            System.out.println("Enter line " + i);
            String line=sc.nextLine();
            a=new Article(line);
            al.add(a);
            a.start();
            a.join();
        }
        
        for(Article article:al)
        {
            count+=article.getCount();
        }
        System.out.println("There are " + count + " articles in the given input");
        sc.close();
    }

 

}