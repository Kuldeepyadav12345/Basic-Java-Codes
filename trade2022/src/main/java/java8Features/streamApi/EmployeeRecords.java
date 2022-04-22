package java8Features.streamApi;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8Features.streamApi.model.Employee;

public class EmployeeRecords {

	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(2, "Kristi", "IT", 50000));
		employee.add(new Employee(1, "Sam", "HR", 50000));
		employee.add(new Employee(3, "James", "HR", 70000));
		employee.add(new Employee(4, "Jack", "IT", 90000));
		employee.add(new Employee(8, "kailey", "HR", 55000));
		employee.add(new Employee(6, "Julie", "Tester", 60000));
		employee.add(new Employee(5, "Criss", "Support", 40000));
		employee.add(new Employee(7, "MAx", "AVP", 100000));

		// displayAllEmployees(employee);
		// displayAllEmployeeOfHrDepartment(employee);
		// displayonlyNameOfEmployeeFromHRDepart(employee);
		// getCountOfEmployeesInItDepartment(employee);
		// getListOfEmployeesInHRDepartment(employee);
		// findSumOfAllSalaries(employee);
		// getMaximunSalary(employee);
		// getMinimunSalary(employee);
		// findAverageSalaryOfEmployees(employee);
		// displayTop3HighestPaidEmployees(employee);
		displayAllEmployeesGropByDepartment(employee);

	}

	private static void displayAllEmployeesGropByDepartment(List<Employee> employee) {
		Map<String, List<Employee>> result = employee.stream().collect(Collectors.groupingBy(e -> e.getDepartment()));

		result.forEach((department, emplo) -> {
			System.out.println("Department name =" + department);
			System.out.println("Employee name ");
			emplo.forEach(e -> System.out.println(e));
		});
//		for(Entry<String, List<Employee>> entry : result.entrySet())
//		{
//			System.out.println("Department name ="+ entry.getKey());
//			System.out.println("Employee name ");
//			entry.getValue().forEach(e->System.out.println(e));
//		}

	}

	private static void displayTop3HighestPaidEmployees(List<Employee> employee) {
		employee.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).limit(3)
				.forEach(e -> System.out.println(e));

	}

	private static void findAverageSalaryOfEmployees(List<Employee> employee) {
		Function<Employee, Double> f = (e) -> e.getSalary();
		OptionalDouble result = employee.stream().mapToDouble((e) -> e.getSalary()).average();
		if (result.isPresent()) {
			System.out.println("Average salary is = " + result.getAsDouble());
		}

	}

	private static void getMaximunSalary(List<Employee> list) {
		Function<Employee, Double> f = (e) -> e.getSalary();
		OptionalDouble result = list.stream().mapToDouble((e) -> e.getSalary()).max();
		if (result.isPresent()) {
			System.out.println("Max salary is " + result.getAsDouble());
		}

	}

	private static void getMinimunSalary(List<Employee> list) {
		OptionalDouble result = list.stream().mapToDouble((e) -> e.getSalary()).min();
		if (result.isPresent()) {
			System.out.println("Min salary is " + result.getAsDouble());
		}
	}

	private static void findSumOfAllSalaries(List<Employee> employee) {
		// double totalSalry=employee.stream().map((e)->e.getSalary()).reduce((double)
		// 0,(a,b)->a+b);
		double totalSalry = employee.stream().mapToDouble((e) -> e.getSalary()).sum();
		System.out.println("Total Salary of all Employees is = " + totalSalry);

	}

	private static void getListOfEmployeesInHRDepartment(List<Employee> employee) {
		List<Employee> ename = employee.stream().filter((e) -> e.getDepartment().equals("HR"))
				.collect(Collectors.toList());
		System.out.println(ename);

	}

	private static void getCountOfEmployeesInItDepartment(List<Employee> employee) {
		long totalNoOfEmp = employee.stream().filter((e) -> e.getDepartment().equals("IT")).count();
		System.out.println(totalNoOfEmp);

	}

	private static void displayonlyNameOfEmployeeFromHRDepart(List<Employee> employee) {
		employee.stream().filter((e) -> e.getDepartment().equals("HR")).map((m) -> m.getName())
				.forEach((ename) -> System.out.println(ename));

	}

	private static void displayAllEmployeeOfHrDepartment(List<Employee> employee) {
		Stream<Employee> stream = employee.stream();
		Predicate<Employee> name = p -> p.getDepartment().equals("HR");
		stream.filter((p -> p.getDepartment().equals("HR"))).forEach((ename -> System.out.println(ename)));

	}

	private static void displayAllEmployees(List<Employee> employee) {
		employee.forEach((e) -> System.out.println(e));

	}

}
