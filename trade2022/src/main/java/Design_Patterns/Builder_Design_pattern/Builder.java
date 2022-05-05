package Design_Patterns.Builder_Design_pattern;

public class Builder {
	public static void main(String[] args) {
		HouseBuilder igglo = new IglooHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(igglo);

		House house = engineer.getHouse();
		System.out.println(house);
	}

}
