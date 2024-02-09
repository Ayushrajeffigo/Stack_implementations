package stack_implementation;

import java.util.Iterator;
import java.util.Stack;



public class Stack_examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello");
//		making of stack
		Stack<String> stack = new Stack<>();
//		to push element into stack
		stack.push("Apple");
		stack.push("Mango");
		stack.push("Red");
		stack.push("yellow");
		System.out.println(stack);
//		using for each only
		for(String s : stack) {
			System.out.println(s);
		}
//		using Iterator
		Iterator<String> sd = stack.iterator();
		while(sd.hasNext()) {
			System.out.println(sd.next());
		}
		stack.peek();
		stack.pop();
		stack.peek();
		System.out.println(stack);
		
	}

}
