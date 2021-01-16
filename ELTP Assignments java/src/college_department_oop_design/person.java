package college_department_oop_design;

public class person implements Iperson
{
	private String name;
	private int age;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	


	public person() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void display()
	{
		System.out.println("-----------------------------------");
		System.out.println("Person name : "+name);
		System.out.println("Person age : "+age);
	}
}
