package Threading;

class Threading  implements Runnable
{
    public void run()
    {
        //executes the task one by one calling the methods
        task1();
        task2();
        task3();
       
    }
   
    void task1()
    {
        System.out.println("Task 1");
    }
   
    void task2()
    {
        System.out.println("Task 2");
    }
   
    void task3()
    {
        System.out.println("Task 3");
    }
   
}
public class SingleTasking
{
    public static void main(String[] args)
    {
        //create an object to MyThread1 class
    	Threading mt=new Threading();
       
        //create a thread t1 and attach in to that object
        Thread t=new Thread(mt);
        //execute the thread t1 on that object's run() method
        t.start();
    }
}
