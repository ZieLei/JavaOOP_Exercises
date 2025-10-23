package employeenumnine;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeeMain {
	public static void main(String[] args){
		Employee employee1 = new Employee("Timothy", 1000.59, LocalDate.parse("2015-05-23"));

		System.out.println(employee1);

		System.out.println("Years of service: " + calculateYearsOfService(employee1.getHireDate()));
	}

	public static long calculateYearsOfService(LocalDate start){
		return ChronoUnit.YEARS.between(start, LocalDate.now());
	}
}
