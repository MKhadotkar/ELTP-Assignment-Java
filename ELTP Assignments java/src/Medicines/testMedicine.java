package Medicines;

public class testMedicine {

	public static void main(String[] args) {
		
		//----------------object of medicine class-----------------
		medicine m=new medicine("MediShop","In market");
		m.displayLab();
		
		//---------------object of tablet class----------------
		System.out.println("=================================");
		tablet t=new tablet("TabShop", "Dry Area Market", "Solid", "Kept in dry area");
		t.displayLab();
		
		//--------------object of syrup class---------------
		System.out.println("=================================");
		syrup s=new syrup("SyrupStore", "Center Market", "Liquid", "Kept in any area");
		s.displayLab();
		
		//---------------object of ointment class-------------
		System.out.println("=================================");
		ointment o=new ointment("OitnmentShop", "Outside Market", "Oil", "For external use");
		o.displayLab();
		
		
		

	}

}
