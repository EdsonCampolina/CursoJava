package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.*;

public class Program {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced?(y/n) ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		System.out.println("PAYMENTS: ");
		for (Employee e : list) {
			System.out.println(e);
		}
		sc.close();

	}

}
