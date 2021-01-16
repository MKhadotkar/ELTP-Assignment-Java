package college_department_oop_design;

public class faculty extends person implements Ifaculty
{
	private int fid;
	
	private int exp;
	
	public int getExp() {
		return exp;
	}



	public void setExp(int exp) {
		this.exp = exp;
	}



	public int getFid() {
		return fid;
	}



	public void setFid(int sid) {
		this.fid = sid;
	}



	public String getFacultyName() {
		return this.getName();
	}



	public void setFacultyName(String name) {
		this.setName(name);
	}



	public int getFacultyAge() {
		return this.getAge();
	}



	public void setFacultyAge(int age) {
		this.setAge(age);
	}

	
	

	public faculty() {
		super();
		// TODO Auto-generated constructor stub
	}



	public faculty(String name, int age,int fid,int exp) {
		
		super(name, age);
		this.fid=fid;
		this.exp=exp;
		
	}



	public void display()
	{
		System.out.println("Faculty Details");
		System.out.println("-----------------------------------");
		System.out.println("Faculty name : "+this.getName());
		System.out.println("Faculty age : "+this.getAge());
		System.out.println("Faculty ID : "+fid);
		System.out.println("Faculty Experiance : "+exp);
		System.out.println("-----------------------------------");
	}
}
