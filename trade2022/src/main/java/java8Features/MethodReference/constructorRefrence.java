package java8Features.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Brands
{
	private String Brand;

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	@Override
	public String toString() {
		return "Brands [Brand=" + Brand + "]";
	}

	public Brands(String brand) {
		super();
		Brand = brand;
	}

	public Brands() {
		super();
	}
	
}
public class constructorRefrence {

	public static void main(String[] args) {
	List<String> brand=Arrays.asList("A1","Herculise","OffRoad");
//	List<Brands> bicycles=brand.stream().map(b->new Brands(b)).collect(Collectors.toList());
	List<Brands> bicycles=brand.stream().map(Brands::new).collect(Collectors.toList());
	bicycles.forEach(System.out::println);
	}

}
