package college_department_oop_design;

public class GradStudent extends student
{
	int gradYear;
	
	public int getGradStudentSid() {
		return this.getSid();
	}



	public void setGradStudentSid(int sid) {
		this.setSid(sid);
	}



	public String getGradStudentName() {
		return this.getName();
	}



	public void setGradStudentName(String name) {
		this.setName(name);
	}



	public int getGradStudentAge() {
		return this.getAge();
	}



	public void setGradStudentAge(int age) {
		this.setAge(age);
	}

	
	

	public GradStudent() {
		super();
		// TODO Auto-generated constructor stub
	}



	public GradStudent(String name, int age,int sid, int gradYear) {
		
		super(name, age, sid);
		this.gradYear=gradYear;
		
	}



	public void display()
	{
		System.out.println("Graduate Student Details");
		System.out.println("-----------------------------------");
		System.out.println("Student name : "+this.getName());
		System.out.println("Student age : "+this.getAge());
		System.out.println("Student ID : "+this.getSid());
		System.out.println("Student's Year Of Passing : "+gradYear);
		System.out.println("-----------------------------------");
	}
}
