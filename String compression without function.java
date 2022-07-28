import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      String s=scn.next();
     
     String ans=s.substring(0,1);
     int count=1;
     for(int i=1;i<s.length();i++){
       char curr=s.charAt(i);
       char prev=s.charAt(i-1);
       if(curr==prev){
         count++;
       }
       else{
         if(count>1){
           ans=ans+count;
           count=1;
         }
         ans=ans+curr;
         
       }
       
     }
     if(count>1){
       ans=ans+count;
       count=1;
     }
     System.out.println(ans);
     
  }
}
