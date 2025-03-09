/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lambda_expressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author KIIT
 */
class Employee
{
  String ename;
  int salary;
  public Employee(String ename,int salary){
  this.ename=ename;
  this.salary=salary;
  }
}
public class functions {
  public functions(){
      Function <Integer,Integer> f = n->n*n;
      System.out.println(f.apply(5));
      Function <String,Integer> f2 = s->{return s.length();};
     // System.out.println("Length of the String : "+f2.apply("Aniket"));
      ArrayList<Employee> a=new ArrayList<>();
      a.add(new Employee("David",50000));
      a.add(new Employee("John",30000));
      a.add(new Employee("Mary",20000));
      Function<Employee,Integer> f1=e->{int sal=e.salary;if(sal>=10000&&sal<=20000)return (sal*10/100);else if(sal>20000&&sal<=30000)return (sal*30/100);else return(sal*40/100);};
      Iterator<Employee> itr=a.iterator();
      Predicate<Integer> p1 = i->i>5000;
      while(itr.hasNext()){
          Employee obj=itr.next();
          if(p1.test(f1.apply(obj))){
              System.out.println("Name : "+obj.ename+"\nSalary : "+obj.salary);
              System.out.println("Bonus of "+obj.ename+" is "+f1.apply(obj));
      }
    }
      Function<Integer,Integer> f3=n->{return n*2;};
      Function<Integer,Integer> f4=n->n*n*n;
      System.out.println((f3).andThen(f4).apply(2));
      System.out.println(f3.compose(f4).apply(2));
  }
}
/*
*/