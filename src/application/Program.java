package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Indivitual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<TaxPayer> list= new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" +i+" data: ");
			System.out.print("Individual or Company(c/i)");
			char ch=sc.next().charAt(0);
			System.out.print("Name: ");
			String name=sc.next();
			System.out.print("Anual income: ");
			double anualIncome=sc.nextDouble();
			if(ch=='i') {
				System.out.print("Health expenditures: ");
				double healthExpentiture=sc.nextDouble();
				list.add(new Indivitual(name, anualIncome, healthExpentiture));
			}
			else if(ch=='c') {
				System.out.print("Number of Employees");
				int numberOfEmployees= sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
		    }
		}	
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	
    }
  }