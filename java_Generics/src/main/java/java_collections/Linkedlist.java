/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_collections;
import java.util.Collections;
import static java.util.Collections.reverseOrder;
import java.util.Iterator;
import java.util.LinkedList;
/**
 *
 * @author KIIT
 */
public class Linkedlist {
    public Linkedlist(){
    LinkedList ln=new LinkedList();
    ln.add(100);
    ln.add("Aniket");
    ln.add(12.34);
    ln.add(true);
    ln.add(null);
    System.out.println("Before Sorting :-");
    System.out.print(ln+" ");
    System.out.println("\nAfter Sorting :-");
     LinkedList<String> sortedList = new LinkedList<String>();
     Iterator<Object> itr=ln.iterator();
     while(itr.hasNext()){
     sortedList.add(String.valueOf(itr.next()));
     }
    Iterator<String> L1 = sortedList.iterator();
    Collections.sort(sortedList);
    while(L1.hasNext()){
    System.out.print(" "+L1.next());
    }
    System.out.println("\nAfter Sorting in ReverseOrder :-");
    Collections.sort(sortedList,reverseOrder());
    sortedList.forEach(System.out::println);
    System.out.println("\nAccesing the elements from the collection :-");
    String o1=String.valueOf(ln.get(3));
    System.out.println(o1);
    System.out.println("Add to the end of the list :-");
    ln.addLast("Last");
    System.out.print(ln);
    System.out.println("\nSize of the collection :- ");
    System.out.print("Sorted List : "+sortedList.size());
    System.out.println("\nOther methods :-");
    System.out.print("First element : "+sortedList.element());
    System.out.print("\nLast element : "+sortedList.peekLast());
    System.out.print("\nlastIndexof : "+sortedList.lastIndexOf(sortedList));
    sortedList.remove();
    System.out.print("\n "+sortedList);
    Object []arr=sortedList.toArray();
    System.out.println(arr);
    sortedList.remove();
    System.out.println(sortedList);
    sortedList.add("12");
    sortedList.add("12");
    System.out.println(sortedList);
    sortedList.removeLastOccurrence("12");
    System.out.println(sortedList);
    sortedList.set(0,"king");
    System.out.println(sortedList);
    //System.out.println(sortedList.nextIndex());
    System.out.println(sortedList.pop());
    sortedList.offer("amit");
    System.out.print(sortedList);
    System.out.print(sortedList.peekFirst());
    }
}
