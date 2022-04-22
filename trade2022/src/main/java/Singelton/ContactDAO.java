package Singelton;

public class ContactDAO {

	private static ContactDAO contactDAO=null;
	private ContactDAO(){
		
	}
	public static ContactDAO getInstance()
	{
		if(contactDAO==null)
		{
			contactDAO=new ContactDAO();
		}
		return contactDAO;
	}
	public void getContactDetails()
	{
		System.out.println("Contact Details");
	}
	public static void main(String[] args) {
		
		ContactDAO obj1=contactDAO.getInstance();
		System.out.println(obj1);
		
		ContactDAO obj2=contactDAO.getInstance();
		System.out.println(obj2);
	}

}
