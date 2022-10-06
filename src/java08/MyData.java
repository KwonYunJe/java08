package java08;

import java.util.ArrayList;
import java.util.List;

public class MyData {
	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		
		int money2= 0;
		
		me.add(1000);
		me.add(185);
		me.add(true);
		me.add("Male");
		
		int money = (int)me.get(0);
		double h = (int)me.get(1);
		boolean bf = (boolean)me.get(2);
		String gender = (String)me.get(3);
		
		System.out.println("Money : " + money);
		System.out.println("Height : " + h);
		System.out.println("Breakfast? : " + bf);
		System.out.println("Gender : " + gender);
		
		money2 = money + 2000;
		if(bf == true) {
			System.out.println("Im full");
		}else {
			System.out.println("Im hungry");
		}
		
		if(gender.equals("Male")) {
			System.out.println("My social number is 1 or 3");
		}else {
			System.out.println("My social number is 2 or 4");
		}
	}
}
