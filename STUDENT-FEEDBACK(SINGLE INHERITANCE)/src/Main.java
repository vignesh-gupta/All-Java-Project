import java.io.*;

 public class Main{
    public static void main(String[] args) throws Exception, IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         
         System.out.println("Enter the student id");
         Integer id=Integer.parseInt(br.readLine());
         System.out.println("Enter the student name");
         String Name=br.readLine();
         System.out.println("Enter the department");
         String Department=br.readLine();
         System.out.println("Enter the course id");
         Integer CourseId=Integer.parseInt(br.readLine());
         System.out.println("Enter the Rating id");
         Integer RatingId=Integer.parseInt(br.readLine());
         System.out.println("Enter review");
         String Review=br.readLine();
         System.out.println("Enter number of stars");
         Integer Stars=Integer.parseInt(br.readLine());
         Student s = new StudentRating(id,Name,Department,CourseId,Review,Stars,RatingId);
         System.out.println(s.toString());
         
       }
       
   }