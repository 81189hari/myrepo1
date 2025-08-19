import java.util.*;
public  class queue{
  public static void main(String[] args)
  {
       Queue <Integer> queue1= new LinkedList<>();
	     queue1.add(10);
		 queue1.add(20);
		 queue1.add(30);
		 queue1.add(40);
		 queue1.offer(50);
		 queue1.add(60);
		 
		System.out.print(" queue content is " +queue1);
		queue1.poll();
		System.out.println ();
		System.out.println(" after removing peek queue content  is :"+queue1);
		System.out.println("peek element is " +queue1.peek());
		
		
		
		
		 }}