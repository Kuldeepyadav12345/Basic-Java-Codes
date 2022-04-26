package java8Features.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import java.util.*;

class Employee{
	public String name;
	public double salary;
	public String city;
	public List<String> mobNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getMobNo() {
		return mobNo;
	}
	public void setMobNo(List<String> mobNo) {
		this.mobNo = mobNo;
	}
	public Employee(String name, double salary, String city, List<String> mobNo) {
		super();
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.mobNo = mobNo;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", city=" + city + ", mobNo=" + mobNo + "]";
	}
	

}

class EmployeeMaster {

	public static void main(String args[]){
		Employee rahul = new Employee("Rahul",15000.00,"Mumbai",Arrays.asList("9221243912","846429236823"));
		Employee vivek = new Employee("Vivek",18000.00,"Pune",Arrays.asList("822323912","84634976823"));
		Employee vaibhav = new Employee("Vaibhav",13000.00,"Delhi",Arrays.asList("7434343912","347989436823"));
		Employee sunil = new Employee("Sunil",25000.00,"Chennai",Arrays.asList("9346443912","78849236823"));

		List<Employee> emplList = new ArrayList<>();
		emplList.add(rahul);
		emplList.add(vivek);
		emplList.add(vaibhav);
		emplList.add(sunil);
		
		emplList.stream().map((e)->e.getMobNo()).forEach((l)->System.out.println(l));
		
		
		
	}
}


