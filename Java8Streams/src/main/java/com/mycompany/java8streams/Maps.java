/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
//import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author KIIT
 */
public class Maps {
    public Maps(){
        List<String> l1=Arrays.asList("Red","Yellow","Black","Green","Blue");
    System.out.println("-----UpperCase-----");
    l1.stream().map(s->(s.toUpperCase())).forEach(c->{System.out.println("Color : "+c);});
    System.out.println("-----Length-----");
    l1.stream().map(s->{return s.length();}).forEach(i->{System.out.println(i);});
        List<Integer> l2=Arrays.asList(1,12,23,54,56,64);
        l2.stream().map(i->{return i*3;}).forEach(x->{System.out.print(x+" ");});
        System.out.println("\n-----Counting the number of objects in a stream()-----");
        System.out.println(l1.stream().map(s->s.toLowerCase()).count());
        System.out.println("-----Selecting the distinct objects from the stream()-------");
        List<String> l3=Arrays.asList("Bus","car","Cycle","bus","car","bike");
        l3.stream().map(s->{String str; str=s.toUpperCase(); return str;}).distinct().forEach(s->{System.out.print(s+" ");});
        System.out.println("\n-----Counting the distinct objects in stream()-----");
        System.out.println(l3.stream().map(s->s.toUpperCase()).distinct().count());
        System.out.println("-----Limited (4) Objects From Stream-----");
        l3.stream().limit(4).forEach(s->{System.out.print(s+" ");});
        System.out.println("\n-----Converting Stream to an Array-----");
        Object[] obj=l3.stream().map(s->s.toUpperCase()).toArray();
        System.out.print("[ ");
        for(Object obj1 : obj){
        String str3=obj1.toString();
        System.out.print(str3+" ");
        }
        System.out.println("]");
        System.out.println("\n-----Use of sorted()------");
        Collections.sort(l3);
        System.out.println(l3);
        l3.stream().sorted().forEach(S->System.out.print(S+" "));
        Set<String> s=new HashSet<>();
        s.add("One apple !");
        s.add("One mango !");
        s.add("Two apples !");
        s.add("More grapes !");
        s.add("Two guavas !");
        System.out.println("\n-----Use Of anyMatch()-----");
        System.out.println("starts with One : ");
        System.out.println(s.stream().anyMatch(s1->s1.startsWith("One")));
        System.out.print("Count : ");
        System.out.println(s.stream().filter(s2->s2.startsWith("One")).count());
        System.out.println("\n-----Use Of allMatch()-----");
        System.out.println("starts with One : ");
        System.out.println(s.stream().allMatch(s4->s4.startsWith("One")));
        if(!s.stream().allMatch(s4->s4.startsWith("One")))
            System.out.println("Count : "+0);
        Optional<String> op=Optional.ofNullable("Aniket");
    }
}
 