package collections;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Gowthami");
		al.add("Anjani");
		al.add("Gaya");
		System.out.println("ArrList elements inserted normally:"+al);
		al.add(1,"Hima");
		al.add(3,"Chandu");
		System.out.println("ArrList elements inserted based on index:"+al);
		al.remove("chandu");
		System.out.println("ArrList element removed based on elements:"+al);
		al.remove(1);
		System.out.println("ArrList element removed based on their index:"+al);
	}
}
