package CollectionsConcept;

import java.util.*;
public class Owner1 {
	Map<String,Double> menu;
	Map<String,Integer> order;
	Owner1(){
		this.menu = new TreeMap<>();
		this.order = new TreeMap<>();
	}
	void menu() {
		System.out.println("---Menu---");
		menu.put("Idli",30.00);
		menu.put("Puri",50.00);
		menu.put("Bonda",30.00);
		menu.put("Vuda",35.00);
		menu.put("Dosa",25.00);
		Set<String> ord = menu.keySet();
		for(String n : ord) {
			System.out.println(n + "="+menu.get(n));
		}
	}
	void displayOrder(Map<String,Integer> dis) {
	    System.out.println("Ordered Items : ");
	    Set<String> o = dis.keySet();
		for(String n : o) {
			System.out.println(n + "="+dis.get(n));
		}
	}
	void Bill(Map<String,Integer> order) {
		Set<String> orde = order.keySet();
		double bill = 0;
		for(String x : orde) {
			bill+=order.get(x) * menu.get(x);
		}
		System.out.println("The bill for items "+order+ " is "+ bill + " rupees.");
	} 
}
