package java8Features.MethodReference;

import java.util.ArrayList;
import java.util.List;

import java8Features.streamApi.model.Dish;
import java8Features.streamApi.model.DishType;

public class methodReference {

	public static void main(String[] args) {

		List<Dish> menu = new ArrayList<>();
		menu.add(new Dish("Chicken", false, 800, DishType.MEAT));
		menu.add(new Dish("French Fries", true, 200, DishType.Others));
		menu.add(new Dish("Rice", true, 300, DishType.Others));
		menu.add(new Dish("Fruit Salad", true, 200, DishType.Others));
		menu.add(new Dish("Pizza", true, 800, DishType.Others));
		menu.add(new Dish("Prowns", false, 1000, DishType.MEAT));
		menu.add(new Dish("Salmon", false, 1000, DishType.Fish));
		//menu.stream().filter((d) -> d.isVegeterain()).forEach((dish) -> System.out.println(dish));
		
		//Method reference 
		menu.stream().filter(Dish::isVegeterain).forEach(System.out::println);
		
		
	}

}
