package Animal;

public class animal {
	
	private String name;
	private String color;
	
	//-----------getters and setters------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//----------constructors--------
	
	public animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	
	//-------local method--
	
	void show()
	{
		System.out.println("I am animal...");
	}
	
	
	
	
}
