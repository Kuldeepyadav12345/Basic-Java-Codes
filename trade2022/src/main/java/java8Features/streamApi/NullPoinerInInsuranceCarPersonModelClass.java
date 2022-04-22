package java8Features.streamApi;

import java.util.Optional;

import java8Features.streamApi.model.Insurance;
import java8Features.streamApi.model.Person;
import java8Features.streamApi.model.car;

public class NullPoinerInInsuranceCarPersonModelClass {

	public static void main(String[] args) {
		/*
		 * If the person had a car and insurence for the car Insurance insureance=new
		 * Insurance("Icic Banks"); car c=new car(insureance); Person p=new Person(c);
		 */

		// But it might happen that all the persons may not have a car or an insureance
		// for a car
		// In that case we have to check for null values

		Insurance insureance = new Insurance("Icic Banks");
		car c = new car(null);// car doesent have an insurance
		Person p = new Person(null);// person dosent owns a car
		System.out.println(checkforNulls(p));

	}

	private static Optional<String> checkforNulls(Person p) {
		if (p == null) {
			return Optional.ofNullable("Unknown");
		}
		car c = p.getCar();
		if (c == null) {
			return Optional.ofNullable("Unknown");
		}
		Optional<Insurance> name = c.getinsurance();
		if (name == null) {
			return Optional.ofNullable("Unknown");
		}
		//return name.getInsuranceCompanyName();
		return null;

	}

}
