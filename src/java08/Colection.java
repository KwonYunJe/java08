package java08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Colection {

	public static void main(String[] args) {
		
		HashSet al = new HashSet();
		
		al.add("Hongildong");
		al.add("Programer");
		al.add("DBManager");
		al.add("DBManager");
		System.out.println("Team List");
		System.out.println(al);
		System.out.println(al.size());
		/////////////////////////////////////////////////////////////////////
		LinkedList ll = new LinkedList();
		
		ll.add("Yesterday Milk");
		ll.add("Today Milk");
		ll.add("Tomorrow Milk");
		
		System.out.println();
		
		ll.removeFirst();
		
		System.out.println(ll);
		System.out.println(ll.size());
		/////////////////////////////////////////////////////////////////////
		ArrayList all = new ArrayList();
		
		all.add("Park");
		all.add("Song");
		all.add("Kim");
		all.add("Song");
		System.out.println(all);
		System.out.println("total : " + all.size());
		for(int i = 0 ; i < all.size(); i++) {
			System.out.println(i + ". "+ all.get(i));
		}
		System.out.println("--------------------------");
		all.remove(1);
		for(int i = 0; i<all.size(); i++) {
			System.out.println(i + ". "+ all.get(i));
		}
	}

}
