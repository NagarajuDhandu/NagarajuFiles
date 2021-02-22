package day5TopicsCollections.queueTypeOfProblms;

import java.util.PriorityQueue;
import java.util.Queue;

public class Progam1 {

	public static void main(String[] args) 
	{
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("aaa");
		queue.add("bbb");
		queue.add("ccc");
		queue.add("ddd");
		queue.add("eee");
		queue.add("aaa");
		
		System.out.println(queue);
		
		Integer i1=queue.size();
		
		System.out.println(i1);
		
		queue.remove("aaa");
		
		System.out.println(queue);
		
		queue.offer("raja");
		
		System.out.println(queue);
		
		queue.poll();
		
		System.out.println();
		
		
		System.out.println(queue.peek());
		
		System.out.println(queue.element());
		
		
		
	}

}
