package college_department_oop_design;

public class TestSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person s=new student("Mayank", 21, 111);
		s.display();
		
		s=new GradStudent("Suyash",21,121,2020);
		s.display();
		
		s=new UnderGradStudent("Pranav", 20, 132, "Third");
		s.display();
		
		s=new faculty("Varun", 25, 144,2);
		s.display();
		
		s=new GradFaculty("Sakshi", 32, 123, 5, 2013);
		s.display();
		
		s=new UnderGradFaculty("Prajwal", 23, 156, 3, "second");
		s.display();
		
		
	}

}
