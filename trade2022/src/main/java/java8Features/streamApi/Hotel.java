package java8Features.streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8Features.streamApi.model.Dish;
import java8Features.streamApi.model.DishType;

public class Hotel {

	public static void main(String[] args) {
		// Used arraylist just to store the data now to process it we will use Stream
		// Api
		List<Dish> menu = new ArrayList<>();
		menu.add(new Dish("Chicken", false, 800, DishType.MEAT));
		menu.add(new Dish("French Fries", true, 200, DishType.Others));
		menu.add(new Dish("Rice", true, 300, DishType.Others));
		menu.add(new Dish("Fruit Salad", true, 200, DishType.Others));
		menu.add(new Dish("Pizza", true, 800, DishType.Others));
		menu.add(new Dish("Prowns", false, 1000, DishType.MEAT));
		menu.add(new Dish("Salmon", false, 1000, DishType.Fish));

		/*// Find low calorie dishes <400 find names of those dishes
		List<String> dishname = new ArrayList<String>();
		for (Dish d : menu) {
			if (d.getCalories() < 400) {
				dishname.add(d.getName());
			}
		}

		for (String dishnames : dishname) {
			System.out.println(dishnames);
		}
		*/
		// Find name of low calories dish names<400 and display them according to
		// calories
		// in ascending order

		List<Dish> lowCaloriesDishes = new ArrayList<Dish>();
		for (Dish dish : menu) {
			if (dish.getCalories() < 400) {
				lowCaloriesDishes.add(dish);
			}
		}
		Comparator<Dish> dishes = new Comparator<Dish>() {

			@Override
			public int compare(Dish d1, Dish d2) {
				/*
				 * if (d1.getCalories() < d2.getCalories()) { return -1; } else if
				 * (d1.getCalories() > d2.getCalories()) { return 1; } else { return 0; }
				 */
				return Integer.compare(d1.getCalories(), d2.getCalories());
			}
		};
		Collections.sort(lowCaloriesDishes, dishes);
		List<String> dishnames =new ArrayList<String>();
		for(Dish dish:lowCaloriesDishes)
		{
			dishnames.add(dish.getName());
		}
		for(String dish :dishnames)
		{
			System.out.println(dish);
		}
	}

}
