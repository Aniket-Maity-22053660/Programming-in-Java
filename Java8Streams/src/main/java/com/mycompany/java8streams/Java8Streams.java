/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author KIIT
 */
class Product{
int id;
String name;
double price;
public Product(int id,String name,double price)
{
   this.id=id;
   this.name=name;
   this.price=price;
}
}
public class Java8Streams {

    public static void main(String[] args) {
       /* Predicate<Integer> p1=n->(n%2==0);
        List<Integer> l1=Arrays.asList(12,3,45,32,27,14);
        List<Integer> l2=new ArrayList<>();
        l1.stream().filter(n->(n%2==0&&n>30)).forEach(n->{System.out.println(n);});
        //l2=l1.stream().filter(m->m%2==0).collect(Collectors.toList());
       // l2.forEach(System.out::println);
       List<String> names=Arrays.asList("Melisandre","Sansa","Jon","Daenery","Joffery");
       List<String> longnames=new ArrayList<String>();
       longnames = names.stream().filter(str->(str.length()>6&&str.length()<8)).collect(Collectors.toList());
       longnames.forEach(s->{System.out.print(s+" ");});
       System.out.println("\n");
       Iterator<String> itr=names.stream().filter(str->(str.length()>6&&str.length()<8)).collect(Collectors.toList()).iterator();
       while(itr.hasNext()){
       System.out.println("Name : "+itr.next());
       }
       Spliterator<String> sptr=longnames.spliterator();
       List<String> words=Arrays.asList("cup",null,"forest","sky","book",null,"theatre");
       List<String>resultwords=words.stream().filter(w->w!=null).collect(Collectors.toList());
       System.out.print("\n");
       for(String word : resultwords){
       System.out.print(word+" ");
       }
       System.out.print("\n");
       List<Product> p=Arrays.asList(new Product(1,"HP Laptop",25000),new Product(2,"Dell Laptop",30000),new Product(3,"Lenovo Laptop",40000),new Product(4,"Apple Laptop",90000));
       p.stream().filter(q->q.price>25000).forEach(q->{System.out.println("Product : "+q.name+" , Price : "+q.price);});*/
       //new Maps();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Java8Streams.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}