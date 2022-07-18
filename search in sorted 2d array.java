import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            int arr[][]=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=scn.nextInt();
                }
            } 
            int x=scn.nextInt();
            int row=0;
            int col=n-1;
            while(row<n&&col>=0){
                if(arr[row][col]==x){
                    System.out.println(row);
                    System.out.println(col);
                    return;
                }
                if(arr[row][col]>x){
                    col--;
                }
                else{
                    row++;
                }
            }
            System.out.println("Not Found");
        }
    

}
