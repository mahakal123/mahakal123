import java.util.*;
public class Main{
    public static void main(String []arge){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        st.push(40);
        System.out.println(st);
        
        
        // to get a element in Stack
        // System.out.println(st.peek()+" "+st.size());
        
        
        System.out.println(st.pop());
        System.out.println(st);
        
    }
}
