package java_medio01.time.exrcicio01.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		//instanciar data hora
		LocalDate now01 = LocalDate.now();
		System.out.println(now01);
		
		LocalDateTime now02 = LocalDateTime.now();
		System.out.println(now02);
		
		Instant now03 = Instant.now(); // data hora GNT horario de londres tem que converter
		System.out.println(now03);
		
		LocalDate now04 = LocalDate.parse("2022-07-20");
		System.out.println(now04);
		
		LocalDateTime now05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println(now05);
		
		Instant now06 = Instant.parse("2022-07-20T01:30:26Z"); 
		System.out.println(now06);
		
		Instant now07 = Instant.parse("2022-07-20T01:30:26-03:00"); // subtraiu 3hora converteu para o horario de São Paulo
		System.out.println(now07);
		
		//customisar data date format
		DateTimeFormatter dateFormat01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate now08 = LocalDate.parse("11/12/1976", dateFormat01);
		System.out.println(now08);
		
		//DateTimeFormatter dateFormat02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate now09 = LocalDate.parse("11/12/1976 12:24", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println(now09);
		
		LocalDate now10 = LocalDate.of(2022, 7, 20);
		System.out.println(now10);
		
		LocalDateTime now11 = LocalDateTime.of(1976, 12, 11, 21, 20, 20);
		System.out.println(now11);
		
		
		
		
		
		
	}

}
