import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            int smvj=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<arr[i][smvj]){
                    smvj=j;
                }
            }
            boolean flag=true;
            for(int k=0;k<arr.length;k++){
                if(arr[k][smvj]>arr[i][smvj]){
                   flag=false;
                   break;
                }
            }
            if(flag==true){
                System.out.println(arr[i][smvj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }

}
