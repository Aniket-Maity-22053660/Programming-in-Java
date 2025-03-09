/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lambda_expressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author KIIT
 */
class Employee1{
   String name;
   int salary;
   int exp;
    Employee1(String name,int salary,int exp){
  this.name=name;
  this.salary=salary;
  this.exp=exp;
}
}
public class consumer_producer {
    public consumer_producer(){
        int flag =1;
        LinkedList<Employee1> l1=new LinkedList<>();
        l1.offer(new Employee1("Aniket",50000,2));
        l1.offer(new Employee1("John",60000,3));
        l1.offer(new Employee1("Patrick",9000,4));
        Predicate<Integer> p1=i->(i>5000);
        Function<Employee1,Integer> f1=e->{int sal=e.salary;if(sal>=10000&&sal<=20000)return (sal*10/100);else if(sal>20000&&sal<=30000)return (sal*30/100);else return(sal*40/100);};
        Iterator<Employee1> itr=l1.iterator();
        Consumer<Employee1> c1=e->{System.out.println("Name : "+e.name+"\nExperience : "+e.exp+" years "+"\nSalary : "+e.salary+"\nBonus : "+f1.apply(e));};
        System.out.println("-----Is the bonus > 5000 ?-----");
        while(itr.hasNext()){
            Employee1 obj=itr.next();
        if(p1.test(f1.apply(obj))){
            flag=0;
            c1.accept(obj);
        }
    }
        if(flag==1)
            System.out.println("-----NIL-----");   
}
}
