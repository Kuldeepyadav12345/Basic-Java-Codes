package Design_Patterns.Builder_Design_pattern;

public class House implements HousePlan {

	private String basement;
	private String roof;
	private String interior;
	private String structure;
	@Override
	public void setBasement(String basement) {
		this.basement=basement;	
	}
	@Override
	public void setStructure(String structure) {
		this.structure=structure;
		
	}
	@Override
	public void setRoof(String roof) {
		this.roof=roof;
		
	}
	@Override
	public void setInterior(String interior) {
		this.interior=interior;
		
	}
	
}
