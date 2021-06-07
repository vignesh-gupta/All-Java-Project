
public class Student {
	int id;
	String name;
	String department;
	int courseId;
	
	Student(int id, String name,String department,int courseId){
		this.id=id;
		this.name=name;
		this.department=department;
		this.courseId=courseId;
	}
    public String toString()
    {
        return "Student :\n"+"Id : " + this.id+"\nName : " + this.name+"\nDepartment : " + this.department+"\nCourse Id : " + this.courseId;
    }
}
