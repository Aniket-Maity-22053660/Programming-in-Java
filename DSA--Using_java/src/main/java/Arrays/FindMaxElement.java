/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author KIIT
 */
public class FindMaxElement {
   public int max_element(int []arr) throws IllegalArgumentException{
        if(arr == null && arr.length == 0)
            throw new IllegalArgumentException();
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
    if(arr[i]>max)
        max=arr[i];
    }
    return max;
    }
   public int second_max_element(int []arr) throws IllegalArgumentException{
    if(arr == null && arr.length == 0)
            throw new IllegalArgumentException();
    int max=Integer.MIN_VALUE;
    int second_max=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
   if(arr[i]>max){
   second_max=max;
   max=arr[i];
   }
   else if(arr[i]<=second_max || max == arr[i]){
   } else {
       second_max=arr[i];
   }
   }
    return second_max;
   }
   public int[] move_zero_to_the_end(int[] arr) throws IllegalArgumentException {
    if (arr == null || arr.length == 0) { // Corrected condition
        throw new IllegalArgumentException("Array cannot be null or empty");
    }

   int nonzero=0;
   int arr1[]=new int[arr.length];
   for(int i=0;i<arr.length;i++){
   if(arr[i]!=0){
   arr1[nonzero++]=arr[i];
   }
   }
   if(nonzero>0){
       for(int i=0;i<nonzero;i++){
   arr[i]=arr1[i];
   }
       for(int i=nonzero;i<arr.length;i++){
       arr[i]=0;
       }
   }
    return arr;
}
   public int[] resize_array(int []arr,int capacity){
        if (arr == null || arr.length == 0) { // Corrected condition
        throw new IllegalArgumentException("Array cannot be null or empty");
    }
    int []temp= new int[capacity];
    for(int i=0;i<capacity;i++){
    temp[i]=arr[i];
    }
       return arr;
   }
   public int find_missing_element(int []arr,int strt,int end){
   int num=(end-strt)+1,num2 = 0;
   int []temp=new int[num];
   for(int i=0;i<temp.length;i++){
   temp[i]=strt++;
   }
   for(int i=0;i<arr.length;i++){
   num2=arr[i];
   for(int j=0;j<temp.length;j++){
   if(num2==temp[j]){
   temp[j]=0;
   break;
   }
   }
   }
   for(int j=0;j<temp.length;j++){
   if(temp[j]!=0){
      num2=temp[j];
    break;
   }
   }
   return num2;
   }
   public Boolean check_palindrome(String str){
   StringBuffer str1=new StringBuffer(str);
   String str2= new String(str1.reverse().toString());
   if(str.equals(str2))
       return true;
   else
       return false;
}
}

