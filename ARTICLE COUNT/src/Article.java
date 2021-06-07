import java.util.ArrayList;
import java.util.StringTokenizer;

 

public class Article extends Thread
{
    
    private String line;
    private Integer count=0;
    
    public String getLine() {
        return line;
    }
    public void setLine(String line) {
        this.line = line;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    
    public Article(String line) {
        this.line = line;
    }
    
    public void run()
    {
            
        ArrayList <String> al= new ArrayList<>();
        StringTokenizer st1 = new StringTokenizer(line,",");
        
        while(st1.hasMoreTokens())
        {
            String str[]=st1.nextToken().split(" ");
            
            for(String s:str)
            {
                al.add(s);
            }
        }
        
        for(String a:al)
        {
            if(a.equalsIgnoreCase("a") || a.equalsIgnoreCase("an") || a.equalsIgnoreCase("the"))
            {
                count++;
            }
        }
        
    }

 

}