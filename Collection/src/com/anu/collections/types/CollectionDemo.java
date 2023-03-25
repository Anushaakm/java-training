package com.anu.collections.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
public void demo1() {
	String[] arr= {};
}

public void demo2() {
	Collection<String> coll=new ArrayList<String>();
	coll.add("Anu");
	coll.add("Manu");
	coll.add("hemu");
	coll.add("hari");
	
System.err.println(coll);
    // Iterating over the collection using iterator
    Iterator<String> it = coll.iterator();
    while(it.hasNext()) {
        String el = it.next();
        System.out.println(el);
    }

    // Iterating over the collection using enhanced for
    for(String el : coll) {
        System.out.println(el);
    }
    
    // unfortunately we dont have a method to get element at ith location

    // remove perticular element
    coll.remove("xyz");

    for(String el : coll) {
        System.out.println(el);
    }
    

    String xyzSts =  coll.contains("hemu") ? "It contains xyz" : "It does not contains xyz";
    System.out.println(xyzSts);
    Collection<String> subColl = new ArrayList<>();
    subColl.add("xyz");
    subColl.add("790");
    coll.addAll(subColl);
    coll.removeAll(subColl);
    coll.containsAll(subColl);
    coll.retainAll(subColl);
	
}

public void demo8() {
    Map<Integer, String> map = new HashMap<>();

    System.out.println("✅ Add ");
    map.put(1, "abc");
    map.put(2, "pqr");
    map.put(2, "lmn");
    map.put(3, null);
    map.put(null, "uytut");
    System.out.println(map);

    System.out.println("✅ Aceess ");
    Set<Integer> keys = map.keySet();
    System.out.println("👇 Keys");
    System.out.println(keys);

    System.out.println("👇 Values");
    Collection<String> values = map.values();
    System.out.println(values);

    Set<Map.Entry<Integer, String>> entries = map.entrySet();

    for(Map.Entry<Integer, String> entry :  entries) {
        Integer key = entry.getKey();
        String value = entry.getValue();
        System.out.println("Key  "+key +" Value "+value);
    }

    String nm = map.get(1);
    System.out.println("👉 Name "+ nm);

    System.out.println("✅ Update ");
    map.replace(2, "bbb");
    System.out.println(map);

    System.out.println("✅ Remove ");
    map.remove(null);
    System.out.println(map);
}
}
