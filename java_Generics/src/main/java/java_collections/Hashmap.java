/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

/**
 *
 * @author KIIT
 */
public class Hashmap {
    public Hashmap(){
    HashMap<Integer,String> m=new HashMap<>();
    //HashMap m=new HashMap();
    m.put(101,"John");
    m.put(102,"David");
    m.put(103,"Scott");
    m.put(104,"Mary");
    m.put(105,"Tye");
    m.put(103,"X");
    m.put(106,"David");
    //System.out.print(m);
   // String str=(String)m.get(104);
    System.out.println(m.remove(106));
  //  System.out.print(m);
    System.out.println(m.containsKey(106));
    System.out.println(m.containsValue("Mary"));
    System.out.println("Empty ? : "+m.isEmpty());
    System.out.println("Key Set : "+m.keySet());
    System.out.println("Only Values : "+m.values());
    System.out.println("All Entries : "+m.entrySet());
    System.out.println("Retrieving keyset using loop : ");
    Set kset = m.keySet();
    Iterator itr1=kset.iterator();
    while(itr1.hasNext()){
    System.out.print(itr1.next()+" ");
    }
    System.out.println("\nEntry set : "+m.entrySet());
    System.out.println(m.get(101));
    System.out.println(m.put(108,"Aniket"));
    System.out.println(m);
    Set<Map.Entry<Integer,String>> s=m.entrySet();
    Iterator<Map.Entry<Integer,String>> itr=s.iterator();
    while(itr.hasNext()){
        Map.Entry e=itr.next();
    System.out.println(e);
    }
    System.out.println("Using the Loop :-\n");
    for(Map.Entry en : m.entrySet()){
        System.out.println(en);
    }
    }
}