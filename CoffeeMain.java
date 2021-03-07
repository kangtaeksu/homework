package homework;

import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) {

//		Coffee cf[] = { new Coffee("Americano", "Cold", "Tall"), 
//				new Coffee("Americano", "Cold", "Tall"),
//				new Coffee("CafeMoca", "HOT", "Grande"),
//				new Coffee("Camomile", "HOT", "Large")};

		Scanner sc = new Scanner(System.in);
		
		Coffee cf[] =  new Coffee[3];
		System.out.println("주문해주세요");
		
		for (int i = 0; i < cf.length; i++) {
			cf[i]= new Coffee();
			cf[i].calculate();
			cf[i].order();
		}

	}
}
