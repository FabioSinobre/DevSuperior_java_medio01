package java_medio01.composition.exercicio2.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java_medio01.composition.exercicio2.entities.Department;
import java_medio01.composition.exercicio2.entities.HourContract;
import java_medio01.composition.exercicio2.entities.Worker;
import java_medio01.composition.exercicio2.entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//List<> contracts = new ArrayList<>();
		
		System.out.print("NOME DO DEPARTAMENTO: ");
		String department = scan.nextLine();
		
		System.out.println("Entre comos dados do trabalhador: ");
		
		System.out.print("Digite o nome: ");
		String name = scan.nextLine();
		
		System.out.print("Qual o nível: ");
		String workerLevel = scan.nextLine();
		
		System.out.print("Base salarial: ");
		double baseSalary = scan.nextDouble();
				
		//System.out.print("Quantos contratos o tarbalhador possue? ");
		//int numberContracts = scan.nextInt();
				
		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(department));
		
		System.out.println("Quantos contratos este trabalhador possui? ");
		int contracts = scan.nextInt();
		for(int i=0; i<contracts; i++) {
			System.out.println("Digite o contrado de numero " + (i+1));
			System.out.print("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scan.next());
			System.out.print("Valor por hora: ");
			double valuePerHours = scan.nextDouble();
			System.out.print("Duração em horas: ");
			int hours = scan.nextInt();
			//instanciar o contrato
			HourContract hourContract = new HourContract(contractDate, valuePerHours, hours);	
			//associar os dois elementos contrato e trabalhador
			worker.addContract(hourContract);
		}
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.print("Digite o mês e o anos para cálcular o contrato (MM/YYYY): ");
		String monthAndYear = scan.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Rendimentos: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		scan.close();
	}

}
