package college_department_oop_design;

public class student extends person
{
	private int sid;
	
	
	
	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
	}



	public String getStudentName() {
		return this.getName();
	}



	public void setStudentName(String name) {
		this.setName(name);
	}



	public int getStudentAge() {
		return this.getAge();
	}



	public void setStudentAge(int age) {
		this.setAge(age);
	}

	
	

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public student(String name, int age,int sid) {
		
		super(name, age);
		this.sid=sid;
		
	}



	public void display()
	{
		System.out.println("Student Details");
		System.out.println("-----------------------------------");
		System.out.println("Student name : "+this.getName());
		System.out.println("Student age : "+this.getAge());
		System.out.println("Student ID : "+sid);
		System.out.println("-----------------------------------");
	}
}
