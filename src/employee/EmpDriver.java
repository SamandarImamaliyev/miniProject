package employee;

import java.util.Scanner;

public class EmpDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Adinizi daxil edin: ");
		String name = sc.nextLine();

		System.out.println("Maasinizi daxil edin: ");
		double salary = sc.nextDouble();

		System.out.println("Is saatinizin miqdarini daxil edin: ");
		int workingHours = sc.nextInt();

		System.out.println("Ise girdiyiniz ili daxil edin: ");
		int hireYear = sc.nextInt();

		double totalSalary, totalSalaryAfterRaise;

		Employee employee = new Employee(name, salary, workingHours, hireYear);
		double tax = employee.computeTax();
		double bonus = employee.computeBonus();
		double raiseSalary = employee.raiseSalary();
		System.out.println("Tax: " + tax);
		System.out.println("Bonus: " + bonus);
		System.out.println("Raise Salary: " + raiseSalary);

		totalSalary = salary - tax + bonus;
		totalSalaryAfterRaise = salary + raiseSalary;

		System.out.println("Salary with tax and bonus= " + totalSalary);
		System.out.println("Salary with raise= " + totalSalaryAfterRaise);
	}

}
