package college_department_oop_design;

public class UnderGradFaculty extends faculty implements Salaried
{
	String Year;
	
	
	public int getUnderGradFacultyExp()
	{
		return this.getExp();
	}
	
	public void setUnderGradFacultyExp(int exp)
	{
		this.setExp(exp);
	}
	
	
	public int getUnderGradFacultyFid() {
		return this.getFid();
	}



	public void setUnderGradFacultySid(int fid) {
		this.setFid(fid);
	}



	public String getUnderGradFacultyName() {
		return this.getName();
	}



	public void setUnderGradFacultyName(String name) {
		this.setName(name);
	}



	public int getUnderGradFacultyAge() {
		return this.getAge();
	}



	public void setUnderGradFacultyAge(int age) {
		this.setAge(age);
	}

	
	
	

	public UnderGradFaculty() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UnderGradFaculty(String name, int age,int fid,int exp, String Year) {
		
		super(name, age, fid,exp);
		this.Year=Year;
		
	}
	
	@Override
	public double calSal(int exp) {
		// TODO Auto-generated method stub
		
		if(exp<=5)
		{
			return 50000;
		}
		else
		{
			return 100000;
		}
		
	}
	

	public void display()
	{
		System.out.println("Under Graduate Faculty Details");
		System.out.println("-----------------------------------");
		System.out.println("Faculty name : "+this.getName());
		System.out.println("Faculty age : "+this.getAge());
		System.out.println("Faculty ID : "+this.getFid());
		System.out.println("Faculty's Year Of studing : "+Year);
		System.out.println("Faculty Salary : "+calSal(this.getExp()));
		System.out.println("-----------------------------------");
	}
}
