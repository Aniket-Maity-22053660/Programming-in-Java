/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author KIIT
 */
public class Arraylist {
    public Arraylist(){
    ArrayList<String> list1=new ArrayList<String>();
    ArrayList<String> list2=new ArrayList<String>();
    String []str={"Blue","Red","Green"};
    for(String str1 : str){
        list1.add(str1);
    }
    String []str2={"Black","Yellow","Orange"};
     for(String str1 : str2){
        list2.add(str1);
    }
     System.out.println("\nColorList - 1\n");
     for(String str3 : list1){
     System.out.print(str3+" ");
     }
     System.out.println("\nColorList - 2\n");
     for(String str4 : list2){
     System.out.print(str4+" ");
     }
     System.out.println("\n-----Color List 1 after addAll() ColorList2-----\n");
     list1.addAll(list2);
     Iterator<String> itr=list1.iterator();
     while(itr.hasNext()){
         System.out.print(itr.next()+" ");
     }
     System.out.println("\n-----Color List 1 after removeAll ColorList 2\n");
     list1.removeAll(list2);
     itr=list1.iterator();
     while(itr.hasNext()){
     System.out.print(itr.next()+" ");
     }
    }
}



