package Design_Patterns.Builder_Design_pattern;

public class CivilEngineer {
	private HouseBuilder houseBuilder;
	public void constructHouse()
	{
		this.houseBuilder.buildBasement();
		this.houseBuilder.buildInterior();
		this.houseBuilder.buildRoof();
		this.houseBuilder.buildStructure();
	}
	  public House getHouse()
	    {
	        return this.houseBuilder.getHouse();
	    }
	  public CivilEngineer(HouseBuilder houseBuilder)
	    {
	        this.houseBuilder = houseBuilder;
	    }

}
