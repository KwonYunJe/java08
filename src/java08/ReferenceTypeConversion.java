package java08;

import java.util.ArrayList;

import javax.swing.JButton;

public class ReferenceTypeConversion {

	public static void main(String[] args) {
		ArrayList  list = new ArrayList();
		
		list.add(100);
		list.add(0.2);
		list.add(true);
		list.add(new JButton());
		System.out.println(list.size());
		
		String name = (String)list.get(0);
		
		int age = (int)list.get(1);
		double eye = (double)list.get(2);
		boolean food = (boolean)list.get(3);
		JButton b = (JButton)list.get(4); 
	}

}
