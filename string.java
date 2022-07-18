import java.io.*;
import java.util.*;

public class main{
  public static void main(String[] args){
    // Scanner scn=new Scanner(System.in);
    
    // String s=scn.nextLine();
    // System.out.println(s);
    // // System.out.pritnln(s.length());
    
    // for(int i=0;i<s.length();i++){
    //   for(int j=i+1;j<=s.length();j++){
    //     System.out.println(s.substring(i,j));
    //   }
    // }
    // String s1="hello";
    // String s2="world";
    // String s3=s1+" "+s2;
    // System.out.println(s3);
    String s="abc chd cbh kdn jju";
    String[]parts =s.split(" ");
    for(int i=0;i<parts.length;i++){
      System.out.println(parts[i]);
    }
     
  }
}
