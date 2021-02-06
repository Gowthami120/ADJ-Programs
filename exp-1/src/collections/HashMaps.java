package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1227, "Gaya");
		hm.put(1233, "Anju");
		hm.put(1235, "Gowthami");
		hm.put(1236, "Chandu");
		hm.put(1241, "Pravallika");
		hm.put(1242, "Sowmi");
		hm.put(1231, "Aishu");
		
		Set keys = hm.entrySet();
		Iterator itr = keys.iterator();
		
		System.out.println("HashMap after insertion:");
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
		
		hm.remove(1231);
		System.out.println("HashMap after deletion:");
		Iterator itr1 = keys.iterator();
		while(itr1.hasNext()) {
			Map.Entry me = (Map.Entry)itr1.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
		
		hm.replace(1227,"Lavanya");
		System.out.println("HashMap after replace operation:");
		Iterator itr2 = keys.iterator();
		while(itr2.hasNext()) {
			Map.Entry me = (Map.Entry)itr2.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
	}
}
