import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


String str="hello";
System.out.println(str);
//here we can get the char at a specific index
char ch=str.charAt(2);
System.out.println(ch);
//we can print all the char 1by1
for(int i=0;i<str.length();i++){
    char cch=str.charAt(i);
    System.out.println(cch);
}
//it will always give the string contain first index to last index-1
String ss=str.substring(1,4);
System.out.println(ss);


    }
}
