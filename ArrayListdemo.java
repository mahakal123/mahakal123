import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(57);
        System.out.println(list+"->"+list.size());

        for(int i=0;i< list.size();i++){
            int val=list.get(i);
            System.out.println(val);
        }
        list.set(2,90);
        System.out.println(list+"->"+list.size());
        list.remove(3);
        System.out.println(list+"->"+list.size());
    }
}
