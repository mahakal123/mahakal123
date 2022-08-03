import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<arr.length;i++){
       arr[i]=scn.nextInt();
     }
     
     for(int i=0;i<arr.length;i++){
       for (int j=i+1;j<arr.length;j++){
         if(arr[i]>arr[j]){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           
         }
       }
     }
     for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
     }
     
     
  }
}
