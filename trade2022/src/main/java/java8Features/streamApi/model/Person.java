package java8Features.streamApi.model;

public class Person {
private car car;

public Person(java8Features.streamApi.model.car car) {
	super();
	this.car = car;
}

public car getCar() {
	return car;
}

public void setCar(car car) {
	this.car = car;
}

public Person() {
	super();
}

@Override
public String toString() {
	return "Person [car=" + car + "]";
}


}
