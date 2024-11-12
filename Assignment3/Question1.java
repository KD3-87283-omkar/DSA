package Assignment3;

import java.util.Stack;


public class Question1 {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6};
		Stack<Integer> s=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			s.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.pop();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			 System.out.println(arr[i]);
		}
		
		
		
	}

}
