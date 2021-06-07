public class StudentRating extends Student{
    
    int ratingId;
    String review;
    int stars;
    Student student;
    
    public StudentRating(int id,String name,String department,int courseId, String review,int stars,int ratingId)
    {
        super(id, name, department, courseId);
        this.ratingId=ratingId;
        this.review=review;
        this.stars=stars;    
    }
    
    public String toString()
    {
        
        return super.toString()+"\nRating ID : "+this.ratingId+"\nReview : "+this.review+"\nRating Stars : "+this.stars;        
    }

 

}