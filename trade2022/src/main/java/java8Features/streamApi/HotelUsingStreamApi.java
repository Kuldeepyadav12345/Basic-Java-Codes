package java8Features.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import java8Features.streamApi.model.Dish;
import java8Features.streamApi.model.DishType;

public class HotelUsingStreamApi {
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
		// displayLowCalDishesInAssendOrderBasdOnCalories(menu);
		// displayAllVegeterianDishesInAssendingOrder(menu);
		// checkIfMenuHasAtleastOneVegeterianDish(menu);
		// checkIfAllMenuItemsIsVegeterianDishes(menu);

		// checkAllMenuItemsAreHealthy(menu);
		// findAnyDish(menu);
		findFirstVegetrianDish(menu);

	}

	private static void findFirstVegetrianDish(List<Dish> menu) {
		Optional<Dish> result = menu.stream().filter((e) -> e.isVegeterain()).findFirst();
		if (result.isPresent()) {
			System.out.println(result.get());
		}

	}

	private static void findAnyDish(List<Dish> menu) {
		Optional<Dish> result = menu.stream().filter((e) -> e.isVegeterain()).findAny();
		if (result.isPresent()) {
			System.out.println("Menu has various dishes");
			System.out.println(result.get());
		} else {
			System.out.println("Menu does not have vegetian dish");
		}
	}

	private static void checkAllMenuItemsAreHealthy(List<Dish> menu) {
		Boolean result = menu.stream().noneMatch((m) -> m.getCalories() > 2000);
		if (result) {
			System.out.println("All healthy foods are there because calories are <2000");
		} else {
			System.out.println("Non helathy foods are there ");
		}

	}

	private static void checkIfAllMenuItemsIsVegeterianDishes(List<Dish> menu) {
		Boolean result = menu.stream().allMatch((e) -> e.isVegeterain());
		if (result) {
			System.out.println("Hotel is 100% Vegeterian");
		} else {
			System.out.println("Hotel is Non Pure Vegeterian");
		}
	}

	private static void checkIfMenuHasAtleastOneVegeterianDish(List<Dish> menu) {
		boolean result = menu.stream().anyMatch((m) -> m.isVegeterain());
		if (result) {
			System.out.println("Menu has vegeterian dish");
		} else {
			System.out.println("Menu dosent have any vegeterian dish");
		}
	}

	private static void displayAllVegeterianDishesInAssendingOrder(List<Dish> menu) {
		Stream<Dish> stream = menu.stream();
		Predicate<Dish> p = (dish) -> dish.isVegeterain();
		Comparator<Dish> c = new Comparator<Dish>() {
			public int compare(Dish d1, Dish d2) {
				return d1.getName().compareToIgnoreCase(d2.getName());

			};
		};
		stream.filter((dish) -> dish.isVegeterain())
				.sorted((Dish d1, Dish d2) -> d1.getName().compareToIgnoreCase(d2.getName()))
				.forEach((dish) -> System.out.println(dish));

	}

	public static void displayLowCalDishesInAssendOrderBasdOnCalories(List<Dish> menu) {
		/*
		 * Find all the dishes name with caloris less than 400 and display them in
		 * assending order
		 */
		Stream<Dish> stream = menu.stream();
		// Predicate<Dish> p=(dish)->dish.getCalories()<400;
		// filter accepts a predicate
		/*
		 * Comparator<Dish> c = new Comparator<Dish>() {
		 * 
		 * @Override public int compare(Dish d1, Dish d2) { // aranges the dish name in
		 * assending order return Integer.compare(d1.getCalories(), d2.getCalories()); }
		 * 
		 * };
		 */
		// Function<Dish, String > f=(dish)->dish.getName();
		stream.filter(d -> d.getCalories() < 400)
				.sorted((dish1, dish2) -> Integer.compare(dish1.getCalories(), dish2.getCalories()))
				.map((dish) -> dish.getName()).forEach(name -> System.out.println(name));
	}

}
