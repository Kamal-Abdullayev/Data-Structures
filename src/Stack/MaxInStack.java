package Stack;

import java.util.Stack;

public class MaxInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(15);
        stack.push(90);
        stack.push(40);
        stack.push(70);

        System.out.println(maxInStack(stack));
    }

    public static int maxInStack(Stack<Integer> stack) {
        int temp = 0;

        while (!stack.empty()) {
            int num = stack.pop();
            temp = num > temp ? num : temp;
        }

        return temp;
    }
}
