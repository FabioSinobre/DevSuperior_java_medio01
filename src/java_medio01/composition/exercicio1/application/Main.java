package java_medio01.composition.exercicio1.application;

import java.util.Date;

import java_medio01.composition.exercicio1.entities.Order;
import java_medio01.composition.exercicio1.entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		//teste
		Order order = new Order(1010, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		System.out.println(os1);
		//converter enum para string
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os2);
	}

}
