package java_medio01.time.exrcicio02.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate now04 = LocalDate.parse("2022-07-20");
		LocalDateTime now05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant now06 = Instant.parse("2022-07-20T01:30:26Z"); 
		
		//varias formas para o mesmo resultado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(now04);
		System.out.println(now04.format(fmt1));
		System.out.println(fmt1.format(now04));
		System.out.println(now04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));//após a variavel ser consumida ela é destruida
		System.out.println("--------------------------------------------------------------");
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println(now05.format(fmt2));
		System.out.println("--------------------------------------------------------------");
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//converte e pega o fuso horario do computador do usuario
		System.out.println(fmt3.format(now06));
		System.out.println("--------------------------------------------------------------");
	}

}
