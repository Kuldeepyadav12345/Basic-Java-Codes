package ImperativeAndDeclerativePrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Imperative {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
			new Person("JACK", Gender.MALE),
			new Person("KIM", Gender.FEMALE),
			new Person("SAM", Gender.MALE),
			new Person("SARA", Gender.FEMALE),
			new Person("NANCY", Gender.FEMALE),
			new Person("LUKE", Gender.MALE)
			);
		List<Person> females=new ArrayList<>();
		for(Person person :persons)
		{
			if(Gender.FEMALE.equals(person.getGender()))
			{
				females.add(person);
			}
		}
		for (Person person : females) {
			System.out.println(person);
		}
	}

	static class Person {
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
	enum Gender {
		MALE, FEMALE
	}

}