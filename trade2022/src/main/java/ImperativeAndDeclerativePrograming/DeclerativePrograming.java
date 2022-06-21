package ImperativeAndDeclerativePrograming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DeclerativePrograming {
public static void main(String[] args) {
	List<Person> persons =Arrays.asList(
			new Person("JACK", Gender.MALE),
			new Person("KIM", Gender.FEMALE),
			new Person("RICK", Gender.MALE),
			new Person("JULIE", Gender.FEMALE),
			new Person("SARA", Gender.FEMALE),
			new Person("ERICK", Gender.MALE)
			);	
	System.out.println("Imperative Type of programming");
	System.out.println("");
	Predicate<Person> females= person->Gender.FEMALE.equals(person.getGender());
	persons.stream().filter(females).
	collect(Collectors.toList()).forEach(System.out::println);
}
static class Person
{
	private String name;
	private Gender gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	public Person(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
}
enum Gender
{
	MALE, FEMALE;
}
}






