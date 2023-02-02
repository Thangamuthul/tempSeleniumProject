package org.Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionStreamExpresion {

	
	public static void main(String args[])
	{
		
		List<EmployessDetails> xyz = new ArrayList<EmployessDetails>();
		xyz.add(new EmployessDetails(45, "Rajsekar", 200000, 10));
		xyz.add(new EmployessDetails(56, "Mari", 100000, 9));
		xyz.add(new EmployessDetails(45, "Vivek", 90000, 12));
		xyz.add(new EmployessDetails(89, "Thangamuthu", 50000, 6));
		xyz.add(new EmployessDetails(45, "Shri Hari", 250000, 18));
		//xyz.stream().sorted().forEach(d-> System.out.println(d));
		
		System.out.println("Before comparator "+xyz);	
		Collections.sort(xyz , new comparatorDesigner());
		System.out.println("After comparator "+xyz);
	}
	
}


class comparatorDesigner implements Comparator<EmployessDetails> {

	@Override
	public int compare(EmployessDetails ed1, EmployessDetails ed2) {
		
		return ed1.getEmpName().compareTo(ed2.getEmpName());
	}
	
}