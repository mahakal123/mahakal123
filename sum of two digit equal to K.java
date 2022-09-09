import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
      }
      int k=scn.nextInt();
      
      for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
          if(arr[i]+arr[j]==k){
            System.out.println(i+","+j);
          }
        }
      }
  }
}
