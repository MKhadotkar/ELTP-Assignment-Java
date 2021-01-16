package college_department_oop_design;

public class UnderGradStudent extends student {
	
	String Year;
	
	public int getUnderGradStudentSid() {
		return this.getSid();
	}



	public void setUnderGradStudentSid(int sid) {
		this.setSid(sid);
	}



	public String getUnderGradStudentName() {
		return this.getName();
	}



	public void setUnderGradStudentName(String name) {
		this.setName(name);
	}



	public int getUnderGradStudentAge() {
		return this.getAge();
	}



	public void setUnderGradStudentAge(int age) {
		this.setAge(age);
	}

	
	

	public UnderGradStudent() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UnderGradStudent(String name, int age,int sid, String Year) {
		
		super(name, age, sid);
		this.Year=Year;
		
	}



	public void display()
	{
		System.out.println("Under Graduate Student Details");
		System.out.println("-----------------------------------");
		System.out.println("Student name : "+this.getName());
		System.out.println("Student age : "+this.getAge());
		System.out.println("Student ID : "+this.getSid());
		System.out.println("Student's Year Of Studing : "+Year);
		System.out.println("-----------------------------------");
	}

}
