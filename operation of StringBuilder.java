import java.io.*;
import java.util.*;

public class main{
  public static void main(String[] args){
    StringBuilder sb=new StringBuilder("hello");
    System.out.println(sb);
    
    char ch=sb.charAt(0);
    System.out.println(ch);
    
    sb.insert(2,'p');
    System.out.println(sb);
    
    sb.deleteCharAt(2);
    System.out.println(sb);
    
    sb.append('r');
    System.out.println(sb);
    
    System.out.println(sb.length());
     
  }
}
