/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dsa.using_java;
import Arrays.*;
/**
 *
 * @author KIIT
 */
public class DSAUsing_java {

    public static void main(String[] args) {
       int []arr={0,0,0,5,0,56,0,23};
       FindMaxElement obj = new FindMaxElement();
       /*System.out.println(new FindMaxElement().max_element(arr));
        System.out.println(new FindMaxElement().second_max_element(arr));*/
       arr=new FindMaxElement().move_zero_to_the_end(arr);
      // for(int i : arr){System.out.print(i+" ");}
      int []arr1={2,4,1,8,6,3,7};
     // System.out.print(obj.find_missing_element(arr1, 1, 8));
     System.out.println(String.valueOf(obj.check_palindrome("1281")));
    }
}
