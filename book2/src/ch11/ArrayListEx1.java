package ch11;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); //ArrayList(int initialCapacity)
		list1.add(new Integer(5)); //boolean add(Object o)
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); //ArrayList(Collection c), List subList(int fromIndex, int toIndex)
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);

		System.out.println("listl.containsAll(list2): " + list1.containsAll(list2)); //boolean containsAll(Collection c)
		
		list2.add("B");
		list2.add("C");
		
		list2.add(3, "A"); //void add(int index, Object element)
		print(list1, list2);
		
		list2.set(3, "AA"); //Object set(int index, Object element)
		print(list1, list2);
		
		System.out.println("listl.retainAll(list2): " + list1.retainAll(list2)); //boolean retainAll(Collection c)
		print (list1, list2);
		
		for (int i = list2.size () - 1; i >= 0; i--) { //int size()
			if(list1.contains(list2.get(i))) //boolean contains(Object o), Object get(int index)
				list2.remove(i); //Object remove(int index)
		}
		print(list1, list2);
	}
		
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2) ;
		System.out.println();
	}
}
