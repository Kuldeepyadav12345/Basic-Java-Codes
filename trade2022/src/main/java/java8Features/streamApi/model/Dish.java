package java8Features.streamApi.model;

public class Dish {
	
	private String name;
	private boolean vegeterain;
	private int calories;
	private DishType type;
	public Dish() {
	}
	public Dish(String name, boolean vegeterain, int calories, DishType type) {
		super();
		this.name = name;
		this.vegeterain = vegeterain;
		this.calories = calories;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVegeterain() {
		return vegeterain;
	}
	public void setVegeterain(boolean vegeterain) {
		this.vegeterain = vegeterain;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public DishType getType() {
		return type;
	}
	public void setType(DishType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegeterain=" + vegeterain + ", calories=" + calories + ", type=" + type + "]";
	}
	
	

}
