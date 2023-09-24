package A03_Collections.B04_Stacks;

import java.util.Stack;

public class Main_Stacks {
    public static void main(String[] args) {

        Stack<Integer> stack_1 = new Stack<>();

        System.out.println("Stack empty: " + stack_1); // Show all
        System.out.println("Stack is empty: " + stack_1.empty()); // Check if empty

        //add
        stack_1.push(1);
        stack_1.push(2);
        stack_1.push(3);
        stack_1.push(4);
        stack_1.push(5);

        // Show one by one
        for (Integer int_stack : stack_1) {
            System.out.println(int_stack);
        }


        System.out.println("Stack: " + stack_1);
        System.out.println("Stack is empty: " + stack_1.empty());

        System.out.println("Stack peek: " + stack_1.peek()); // Show last element
        System.out.println("Stack pop: " + stack_1.pop()); // Remove last element
        System.out.println("Stack peek: " + stack_1);

        System.out.println("Stack search (3): " + stack_1.search(3)); // Search for element
        System.out.println("Show 3: " + stack_1.get(2)); // Show element by index
    }
}
