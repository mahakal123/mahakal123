import java.io.*;
import java.util.*;

public class main{
  public static void main(String[] args){
    ArrayList<Integer> list=new ArrayList<>();
    System.out.println(list+"->"+list.size());
    
    // here we can change the size of ArrayList just by adding the value using following command
    list.add(10);
    list.add(14);
    list.add(62);
    list.add(15);
    list.add(17);
    list.add(69);
    System.out.println(list+"->"+list.size());
    // to remove
    list.remove(0);
    System.out.println(list+"->"+list.size());
    
    // to add
    list.add(1,1000);
    System.out.println(list+"->"+list.size());
    
    // to get a value
    int val=list.get(2);
    System.out.println(val);
    
    // to update
    list.set(2,300);
    System.out.println(list+"->"+list.size());
   
  }
}
