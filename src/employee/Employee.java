package employee;

public class Employee {
	private String name;
	private double salary = 0;
	private int workHours;
	private int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;

	}

	public double computeTax() {
		double tax = 0.0;
		if (salary <= 1000) {
			System.out.println("you dont have to pay tax!");
		} else {
			tax = salary * 0.03;
		}
		return tax;
	}

	public double computeBonus() {
		double bonus = 0.0;
		int additionalWorkigHours = 0;
		if (workHours <= 168) {
			System.out.println("you dont have bonus!");
		} else {
			additionalWorkigHours = workHours - 168;
			bonus = additionalWorkigHours * 30;
		}

		return bonus;
	}

	public double raiseSalary() {
		int workedYear = 2023 - hireYear;
		double salaryRaise = 0.0;
		if (workedYear < 10) {
			salaryRaise = salary * 0.05;
		} else if ((workedYear < 20) && (workedYear > 9)) {
			salaryRaise = salary * 0.1;
		} else {
			salaryRaise = salary * 0.15;
		}

		return salaryRaise;
	}

	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear=" + hireYear;
	}

}
