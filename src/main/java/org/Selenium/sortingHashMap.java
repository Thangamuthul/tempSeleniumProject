package org.Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class sortingHashMap {
	public static void main(String[] args) {
		String inputstring="Tangamuthu Lakshamanaraj";
		Map<Character, Integer> charHolder = new HashMap<Character, Integer>();
		
		for(int i=0;i<inputstring.length();i++) {
			if(charHolder.containsKey(inputstring.charAt(i))) {
				charHolder.put(inputstring.charAt(i), charHolder.get(inputstring.charAt(i))+1);
			}
			else {
				charHolder.put(inputstring.charAt(i), 1);
			}
		}	
		
		Iterator<Map.Entry<Character, Integer>> mapIterator =charHolder.entrySet().iterator();
		
	while(mapIterator.hasNext()) {
		Map.Entry<Character, Integer> singleMap= mapIterator.next();
		System.out.println(singleMap.getKey()+"\t"+singleMap.getValue());
	}
	
	Set<Map.Entry<Character, Integer>> setOfKeyValues=charHolder.entrySet();
	List<Map.Entry<Character, Integer>> ListOfKeyAndValues= new ArrayList<Map.Entry<Character, Integer>>(setOfKeyValues);
	Collections.sort(ListOfKeyAndValues, new Comparator<Map.Entry<Character, Integer>>() {

		@Override
		public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
			
			return o1.getValue().compareTo(o2.getValue());
		}
	});
	System.out.println("After Sort ");
	
	for(Map.Entry<Character, Integer> singleMap : ListOfKeyAndValues) {
		System.out.println(singleMap.getKey()+"\t"+singleMap.getValue());
	}
	
	}
}	
