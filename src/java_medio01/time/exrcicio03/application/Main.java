package java_medio01.time.exrcicio03.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		LocalDate now04 = LocalDate.parse("2022-07-20");
		LocalDateTime now05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant now06 = Instant.parse("2022-07-20T01:30:26Z"); 
		
		//COVERTER DATA GLOBAL PARA LOCAL TEM QUE INFORMAR O TIMEZONE
		LocalDate r1 =LocalDate.ofInstant(now06, ZoneId.systemDefault());
		System.out.println(r1);
		System.out.println("-----------------------------------------------------------------------");
				
		LocalDate r2 =LocalDate.ofInstant(now06, ZoneId.of("Portugal"));
		System.out.println(r2);
		System.out.println("-----------------------------------------------------------------------");
		
		LocalDateTime r3 =LocalDateTime.ofInstant(now06, ZoneId.systemDefault());
		LocalDateTime r4 =LocalDateTime.ofInstant(now06, ZoneId.of("Portugal"));
		System.out.println(r3);
		System.out.println(r4);
		System.out.println("-----------------------------------------------------------------------");
		
		//OBTER DADOS DE UMA DATA LOCAL
		System.out.println(now04.getDayOfMonth());
		System.out.println(now04.getMonthValue());
		System.out.println(now04.getYear());
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println(now05.getHour());
		System.out.println(now05.getMinute());
		System.out.println(now04.getChronology());
		System.out.println("-----------------------------------------------------------------------");
		
		//CÁLCULO COM DATA
		LocalDate pastWeekLocalDate = now04.minusDays(7);
		System.out.println(pastWeekLocalDate);
		
		LocalDate nextWeekLocalDate1 = now04.plusDays(27);
		System.out.println(nextWeekLocalDate1);
		
		System.out.println("-----------------------------------------------------------------------");
		
		//FORMATAR DATA LOCAL
		Instant pastWeekInstant = now06.minus(7, ChronoUnit.DAYS);
		System.out.println(pastWeekInstant);
		
		Instant nextWeekInstant = now06.plus(7, ChronoUnit.DAYS);
		System.out.println(nextWeekInstant);
		
		System.out.println("-----------------------------------------------------------------------");
		
		//DURAÇÃO DE UMA DATA HORA SE INVERTE GERA UM NÚMERO NEGATIVO
		Duration t1 = Duration.between(pastWeekInstant, nextWeekInstant);
		System.out.println(t1.toDays());
		
		
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), now04.atStartOfDay());//TEM QUE CONVERTER TEMPO HORAS E MINUTOS PODE USA ASSIM --> atTime(0, 0)
		System.out.println(t2.toDays());
		System.out.println("-----------------------------------------------------------------------");
		
		
		
		//CASO QUEIRA IMPRIMIR AS POSSIBILIDADES
		/*for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}*/
	}

}
