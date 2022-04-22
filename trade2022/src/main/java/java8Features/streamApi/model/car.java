package java8Features.streamApi.model;

import java.util.Optional;

public class car {
	private Insurance insurance;

//	public Insurance getinsurance() {
//		return insurance;
//	}
	public Optional<Insurance> getinsurance()
	{
		return Optional.of(insurance);
	}

	public void setinsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public car(Insurance insurance) {
		super();
		this.insurance = insurance;
	}

	public car() {
		super();
	}

	@Override
	public String toString() {
		return "car [insurance=" + insurance + "]";
	}
	

}
