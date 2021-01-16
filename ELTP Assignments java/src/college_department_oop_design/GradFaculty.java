package college_department_oop_design;

public class GradFaculty extends faculty implements Salaried {
	
	int gradYear;
	
	
	public int getGradFacultyExp()
	{
		return this.getExp();
	}
	
	public void setGradFacultyExp(int exp)
	{
		this.setExp(exp);
	}
	
	
	public int getGradFacultyFid() {
		return this.getFid();
	}



	public void setGradFacultySid(int fid) {
		this.setFid(fid);
	}



	public String getGradFacultyName() {
		return this.getName();
	}



	public void setGradFacultyName(String name) {
		this.setName(name);
	}



	public int getGradFacultyAge() {
		return this.getAge();
	}



	public void setGradFacultyAge(int age) {
		this.setAge(age);
	}

	
	
	

	public GradFaculty() {
		super();
		// TODO Auto-generated constructor stub
	}



	public GradFaculty(String name, int age,int fid,int exp, int gradYear) {
		
		super(name, age, fid,exp);
		this.gradYear=gradYear;
		
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
		System.out.println("Graduate Faculty Details");
		System.out.println("-----------------------------------");
		System.out.println("Faculty name : "+this.getName());
		System.out.println("Faculty age : "+this.getAge());
		System.out.println("Faculty ID : "+this.getFid());
		System.out.println("Faculty's Year Of Passing : "+gradYear);
		System.out.println("Faculty Salary : "+calSal(this.getExp()));
		System.out.println("-----------------------------------");
	}

	
}
