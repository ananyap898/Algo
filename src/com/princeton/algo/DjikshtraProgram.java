package com.princeton.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class DjikshtraProgram {

	public static void main(String[] args) throws IOException {
		
		Stack<String> operandStack = new Stack<String>();
		Stack<Double> valueStack = new Stack<Double>();
		
		System.out.println("Please enter values...");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        
		while(!"".equals(input)){
			String values = bufferedReader.readLine();
			if(values.equals("(")){
				;
			}else if(values.equals("+")){
				operandStack.push(values);
			}else if(values.equals("*")){
				operandStack.push(values);
			}else if(values.equals(")")){
				String operandString = operandStack.pop();
				if(operandString.equals("+")){
					valueStack.push(valueStack.pop() + valueStack.pop());
				}else if(operandString.equals("*")){
					valueStack.push(valueStack.pop() + valueStack.pop());
				}
			
			}else {
				valueStack.push(new Double(values));
			}
			System.out.println(valueStack.pop());
		}
		

	}

}
