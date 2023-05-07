package  Practice;

import java.util.ArrayList;
import java.util.List;

public class Car{
	public static void main(String[] args) {
		
List<String> list1 = new ArrayList<String>();

list1.add("One"); 
list1.add("Two");

list1.add("Three");

List<String> list2 = new ArrayList<String>();

list2.add("Two");

list1.removeAll(list2);

System.out.println(list1);
}
}