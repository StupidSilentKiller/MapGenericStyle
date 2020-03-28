package com.datastructure;

import java.util.*;
import java.util.Map.Entry;

public class MapGenericStyle {
	
	public static void main(String args[]) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(100, "Shampa");
		map.put(201, "Sharmin");
		map.put(310, "Raka");
		for(Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
