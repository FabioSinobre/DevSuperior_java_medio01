package java_medio01.heranca01.application;

import java_medio01.heranca01.entities.Account;
import java_medio01.heranca01.entities.BusinessAccount;
import java_medio01.heranca01.entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);
		
		
		//Upacasting
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//Dowcast
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		/*ERRO COMUM 
		 * BusinessAccount acc5 = (BusinessAcount) acc3;
		 * QUANDO O PROGRAMA EXECULTAR GERA ERRO POIS ACC3 NÃO É COMPATIVEL COM ACC5 TIPOS DIFERENTE SEM CONECÇÃO
		 * O COMPILADOR NÃO CONSEGUE VER DEVEMOS FAZER UM TESTE PARA GARANTIR.
		 */
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("UPDATE! ");
		}
				
	}

}
