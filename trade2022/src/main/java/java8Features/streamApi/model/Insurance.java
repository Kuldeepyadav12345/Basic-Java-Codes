package java8Features.streamApi.model;

import java.util.Optional;

public class Insurance {
private String insuranceCompanyName;

//public String getInsuranceCompanyName() {
//	return insuranceCompanyName;
//}
public Optional<String> getInsuranceCompanyName()
{
	return Optional.of(insuranceCompanyName);
}

public void setInsuranceCompanyName(String insuranceCompanyName) {
	this.insuranceCompanyName = insuranceCompanyName;
}

public Insurance(String insuranceCompanyName) {
	super();
	this.insuranceCompanyName = insuranceCompanyName;
}

public Insurance() {
	super();
}

@Override
public String toString() {
	return "Insurance [insuranceCompanyName=" + insuranceCompanyName + "]";
}

}
