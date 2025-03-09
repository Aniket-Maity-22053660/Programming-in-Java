/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java_generics;
import java_collections.*;
import java.Linkedlist.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author KIIT
 */
public class Java_Generics {

    static class PrintArray<T>{
    public void print(T []arr){
    for(T value : arr){
    System.out.print(value+" ");
    }
    }
    }
    
    public static void main(String[] args) {
        /*ArrayList<String> colorList =new ArrayList<String>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        System.out.println("\n-----Using For-Each loop -----\n");
              for(String color : colorList){
              System.out.print(color+" ");
              }
              System.out.println("\n-----Using Iterator-----\n");
              Iterator<String> itr = colorList.iterator();
              while(itr.hasNext()){
                  System.out.print(itr.next()+" ");
              }
              System.out.println("\n-----Using For-Loop-----\n");
              for(int i=0;i<colorList.size();i++){
              System.out.print(colorList.get(i)+" ");
              }
       // new Arraylist();
              Student []obj1=new Student[3]; 
              obj1[0]=new Student("Kotlin",123);
              obj1[1]=new Student("Linux",234);
              obj1[2]=new Student("fish",345);
              ArrayList<Student> stud=new ArrayList<Student>();
              stud.add(obj1[0]);
              stud.add(obj1[1]);
              stud.add(obj1[2]);
              ArrayList<Teacher> teach=new ArrayList<Teacher>();
              teach.add(new Teacher("teacher1",456));
              teach.add(new Teacher("teacher2",567));
              teach.add(new Teacher("teacher3",678));
              Iterator itr=stud.iterator();
              System.out.println("-----STUDENT-----");
              while(itr.hasNext()){
                  Student stu =(Student)itr.next();
              stu.retrieve();
              }
              itr=teach.iterator();
              System.out.println("-----TEACHER-----");
              while(itr.hasNext()){
                  System.out.println(itr.next().toString());
              }
             */ 
        //new Linkedlist();
        new Hashmap();
              }

}
class Student{
public String name;
public Integer rollno;
public Student(String name,Integer rollno){
this.name=name;
this.rollno=rollno;
}
public void retrieve(){
System.out.println("Name :"+name+" "+"Roll no :"+rollno);
}
}
class Teacher{
public String name;
public Integer rollno;
public Teacher(String name,Integer rollno){
this.name=name;
this.rollno=rollno;
}
@Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollno;
    }
}

