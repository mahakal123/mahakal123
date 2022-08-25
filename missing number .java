import java.util.*;
public class main{
  public static void main(String []arge){
    Scanner scn=new Scanner (System.in);
    int n=scn.nextInt();
    int arr[]=new int[n-1];
    for(int i=0;i<arr.length;i++){
      arr[i]=scn.nextInt();
    }
    int sum1=(n*(n+1))/2;
    // System.out.println(sum1);
    int sum=arr[0];
    for(int i=1;i<arr.length;i++){
     sum= sum+arr[i];
      
    }
    int ans=sum1-sum;
    System.out.println(ans);
    
  }
  
}
