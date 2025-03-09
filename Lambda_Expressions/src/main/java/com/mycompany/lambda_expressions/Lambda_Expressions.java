/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lambda_expressions;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.*;
/**
 *
 * @author KIIT
 * @param <T>
 * @param <K>
 */
interface I1{
public void print();
}
interface I2{
public String print();
}
/*class Employee{
public String name;
public int salary;
public int experience;
public Employee(String name , int salary , int experience){
    this.name=name;this.salary=salary;this.experience=experience;
}
}
*/
public class Lambda_Expressions {
     //()->System.out.prit("Hello");

    public static void main(String[] args) {
        /* I1 i1=()->System.out.println("Printing !");
        i1.print();
        I2 i2=()->"Printing 2 !";
        System.out.println(i2.print());
         
        Predicate<Integer> p1=(i)->i>10&&i<16;
        System.out.println(p1.test(12));
        Predicate<String> p2=s->(s.length()>4);
        System.out.println(p2.test("At"));
        String []names={"david","Scott","Smith","Jhon","Mary"};
        for(String str : names){
            if(p2.test(str)){
                System.out.println("Length of "+str+" is > 4 !");
            
            }
        }
        Predicate<Employee> pr2=e->(e.salary>30000 && e.experience>3);
        LinkedHashSet<Employee> lh= new LinkedHashSet<>();
        lh.add(new Employee("John",50000,5));
        lh.add(new Employee("David",20000,2));
        lh.add(new Employee("Scott",30000,3));
        lh.add(new Employee("Scott",40000,6));
        Iterator<Employee> itr = lh.iterator();
        System.out.println("\n Salary > 30000 && Experince > 3 :-");
        while(itr.hasNext()){
            Employee obj = itr.next();
        if(pr2.test(obj)){
        System.out.println("Name : "+obj.name);
        }
        }
        int []a={3,2,4,55,566,7,54,332,45};
        Predicate<Integer> P1 = i->i%2==0;
        Predicate<Integer> P2 = i->i>50;
        for(int i : a){
        if(P1.test(i)&&P2.test(i))
            System.out.println(i+" is even and greater than 50 !");
        }*/
        //new functions();
        new consumer_producer();
    }
}
