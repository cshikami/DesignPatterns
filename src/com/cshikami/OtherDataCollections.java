package com.cshikami;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cshikami.dataCollections.IDataCollectionsFactory;

public class OtherDataCollections implements IDataCollectionsFactory {

	@Override
	public void showDataCollection() {
		
		System.out.println("Managing resizable arrays with ArrayList:");
		List<String> list = new ArrayList<>();
		
		list.add("California");
		list.add("Oregon");
		list.add("Washington");
		
		System.out.println(list);
		
		list.add("Alaska");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		String state = list.get(1);
		System.out.println("The second state is: " + state);
		
		int pos = list.indexOf("Alaska");
		System.out.println("Alaska is at position: " + pos);
		System.out.println("");
		
		System.out.println("Managing unordered data with HashMap:");
		Map<String, String> map = new HashMap<>();
		
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		System.out.println(map);
		map.put("Alaska", "Juneau");
		System.out.println(map);
		
		String cap = map.get("Oregon");
		System.out.println("The capitol of Oregon is: " + cap);
		
		map.remove("California");
		System.out.println(map);
		System.out.println("");
		
		System.out.println("Looping through collections with iterators and for-each:");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}
		
		System.out.println("");
		System.out.println("ArrayList ForEach:");
		
		for(String value : list) {
			System.out.println(value);
		}
		
		System.out.println("");
		System.out.println("Java 8 method reference:");
		list.forEach(System.out::println);
		System.out.println("");
		
		System.out.println("HashMap Iterator:");
		Set<String> keys = map.keySet();
		Iterator<String> iterator1 = keys.iterator();
		while(iterator1.hasNext()) {
			String key = iterator1.next();
			System.out.println("The capitol of " + key + " is " + map.get(key));
		}
		System.out.println("");
		
		System.out.println("HashMap ForEach:");
		for(String key : keys) {
			System.out.println("The capitol of " + key + " is " + map.get(key));
		}
		System.out.println("");
		
	}
}
