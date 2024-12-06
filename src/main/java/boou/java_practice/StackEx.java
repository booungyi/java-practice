package boou.java_practice;
import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {
        Stack stack = new Stack<Integer>();

        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
