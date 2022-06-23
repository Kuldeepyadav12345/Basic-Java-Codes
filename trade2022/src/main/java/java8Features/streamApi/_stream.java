package java8Features.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java8Features.streamApi._stream.Person;

public class _stream {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("ALEX", Gender.FEMALE), new Person("ALEXA", Gender.FEMALE),
				new Person("JACK", Gender.MALE), new Person("SARA", Gender.FEMALE),
				new Person("ALAXENDER", Gender.MALE), new Person("ANGLE", Gender.FEMALE),
				new Person("OBAMA", Gender.MALE));
		Predicate<Person> females = x -> x.getGender().equals(Gender.FEMALE);

		List<Person> ListOfFemales = persons.stream().filter(females).collect(Collectors.toList());
		ListOfFemales.forEach(x -> System.out.println(x.Name + "  " + x.getGender()));

		// Find the length of each name using stream API

		persons.stream().filter(females).map(names -> names.Name)
		.mapToInt(String::length).forEach(System.out::println);

	}

	static class Person {
		private String Name;
		private Gender gender;

		public Person(String name, Gender gender) {
			super();
			Name = name;
			this.gender = gender;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}

	}

	enum Gender {
		MALE, FEMALE
	}

}
