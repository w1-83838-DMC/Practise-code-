package com.sunbeam;

import java.util.Stack;

public class ExpressionEvaluation {
	
	public static int calculate(int op1, char opr, int op2)
	{
		switch(opr)
		{
			case '+': return op1+op2;
			case '-': return op1-op2;
			case '*': return op1*op2;
			case '/': return op1/op2;
			case '%': return op1%op2;
			case '$': return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	public static int postfixEvaluate(String postfix)
	{
		// 1. Create stack To push oprands 
		Stack<Integer> st= new Stack<Integer>();
		// 2. check postfix expression from left to right
		for(int i=0; i<postfix.length(); i++)
		{
			//3.extract character of ith index 
			char opr=postfix.charAt(i);
			// 4. if character is operand 
				if(Character.isDigit(opr))
					st.push(opr-'0'); // convert character to digit 
			// 5. if character is operator 
				else {
					// popped two operands from stack 
					int op2= st.pop();
					int op1= st.pop();
					// perform arithmethic of op1 and op2 and opr(ele)
					int res=calculate(op1,opr,op2);
					
					st.push(res);
				}
		}
		return st.pop();	
	}
	public static int prefixEvaluate(String prefix)
	{
		// 1. create stack to push operands
		Stack<Integer> st= new Stack<Integer>();
		// 2. check prefix expression from right to left
		for(int i=prefix.length()-1; i>=0; i--)
		{
			// 3. extract character of the ith index 
			char opr=prefix.charAt(i);
			// 4. if character is operand 
			if(Character.isDigit(opr))
				st.push(opr-'0');  // convert character in Digit 
			// 5. if character is operator 
			else 
			{
				// 5.1 pop two operands from stack 
				int op1=st.pop();
				int op2=st.pop();
				// 5.2 perform arithmethic of op1 and op2 and opr(ele)
				
				int res=calculate(op1, opr, op2);
				// 5.3 push result back on stack 
				st.push(res);
			}
				
		}
		// return the result 
		return st.pop();
		
	}

	public static void main(String[] args) {
		String postfix="456*3/+9+7-";
		System.out.println("Postfix "+ postfix);
		int result=postfixEvaluate(postfix);
		System.out.println("Result "+ result);
		
		String prefix="-++4/*56397";
		System.out.println("Prefix "+ prefix);
		int result1=prefixEvaluate(prefix);
		System.out.println("Result1 "+ result1);
		
	}

}
