import java.util.*;
public  class stack{
  public static void main(String[] args)
  {
       Stack <Integer> stack1= new Stack<>();
	     stack1.push(10);
		 stack1.push(20);
		 stack1.push(30);
		 stack1.push(40);
		stack1.push(50);
		stack1.push(60);
		System.out.print("stack content is " +stack1);
		stack1.pop();
		
		System.out.println("stack content is:"+stack1);
		
		System.out.println("peek element is :" +stack1.peek());
		System.out.println("empty return false else true : "+ stack1.empty());
		
		
		
		 }}