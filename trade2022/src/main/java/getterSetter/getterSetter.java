package getterSetter;

public class getterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin");
		CountHolder c= new CountHolder();
		for(int i=0;i<10000;i++)
		{
			c.setCount(i);	
		}
		for(int j=0;j<10000;j++)
		{
			c.setCount(j);	
		}
		System.out.println("Total count="+c.getCount());
		
	}

	
}
