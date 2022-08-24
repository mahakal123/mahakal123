import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner scn=new Scanner (System.in);
     int n=scn.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<arr.length;i++){
       arr[i]=scn.nextInt();
     }
     
    // for(int i=0;i<arr.length;i++){
    //   System.out.println(arr[i]);
    // }
    
    // System.out.println("reversed array");
    for(int i=arr.length-1;i>=0;i--){
      System.out.println(arr[i]);
    }
     
  }
  
}
