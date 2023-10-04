import java.util.*;
class StackAddBottom{
    public static void pushAtBottom(int data,Stack<Integer> s) {
        if(s.empty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data, s);
        s.push(top);


        
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtBottom(5, s);
        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }

    
        
    }
}