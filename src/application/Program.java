package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String strPath = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
			
			List<Employees> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] sep = line.split(",");
				list.add(new Employees(sep[0], sep[1], Double.parseDouble(sep[2])));
				
				line = br.readLine();
			}
			
			System.out.print("Enter a salary: ");
			double value = sc.nextDouble();
			System.out.printf("Email of people whose salary is higher than %.2f ", value );
			System.out.println();
			
			List<String> moreThanTheValue = list.stream().filter(p -> p.getSalary() > value).map(p -> p.getEmail()).sorted().collect(Collectors.toList());
			moreThanTheValue.forEach(System.out::println);
			
			double sum = list.stream().filter(p -> p.getName().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0, (y,x) -> y + x);
			System.out.println("Sum of salary of people whose the name starts with 'M': " + sum);
			
		}
		catch(IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		sc.close();
	}

}
