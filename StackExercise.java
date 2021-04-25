package lab5;

import java.util.LinkedList;
import java.util.Stack;

public class StackExercise {

	/*
	 * Given an expression string exp, write a program to examine whether the pairs
	 * and the orders of parenthesis are correct in exp. For example, the program
	 * should print true for exp = [()[]] and false for exp = [()[])
	 */
	/**
	 * 
	 * @param str
	 * @return true if balanced; false is unbalanced
	 */
	public static boolean isBalancedParentheses(String str) {
		Stack<Character> stk = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '[') {
				stk.push(ch);
				continue;
			}
			if (ch == ')' || ch == ']') {
				if (!stk.isEmpty() && (stk.peek() == '(' || stk.peek() == '[')) {
					stk.pop();
					continue;
				}
				stk.push(ch);
			}
		}
		return stk.isEmpty();
	}

	/*
	 * 
	 * Reverse the all the items in the linkedlist and return the return the head of
	 * the reversed one, for example: A -> B -> C should be reversed as: C->B->A
	 */

	/**
	 * @param lst - the linkedlist to be reversed
	 * @return the linkedlist with all items reversed -
	 */
	public static LinkedList<String> revLinkedList(LinkedList<String> lst) {
		Stack<String> stk = new Stack<String>();
		LinkedList<String> ret = new LinkedList<String>();
		for (String item : lst) {
			stk.push(item);
		}
		while (!stk.isEmpty()) {
			ret.add(stk.pop());
		}
		return ret;
	}

	
}
