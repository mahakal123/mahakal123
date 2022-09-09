import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
      }
      int temp;
      int j=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          j++;
        }
       }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
