package Threading;

//two threads performing two task at a time- Theatre Example



class Mythread2 implements Runnable
{
    //declare a string to represent the task
    String str;

 

    public Mythread2(String str) 
    {
        this.str=str;
        
    }
    
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(str +" : "+i);
            try
            {
                Thread.sleep(2000);
                //cease thread execution for 2000 miliseconds
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
    
}
public class Multitasking 
{
    public static void main(String[] args) 
    {
        //create two objects to represent two tasks
        
        Mythread2 obj1=new Mythread2("Cut the ticket");
        Mythread2 obj2=new Mythread2("Show the ticket");
        
        //create two thread and attach them to the two objects
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        
        //start the threads
        t1.start();
        t2.start();
    }
}
