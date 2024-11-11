package Assignment2;

class Queue{

	int front=-1;
	int rear=-1;
	int size;
	int arr[];
	public Queue(int s)
	{
		size=s;
		arr=new int[size];
	}

	public void push(int e)
	{
		if(!isFull())
		{
			rear++;
			 arr[rear]=e;
		}
	}
	public int pop()
	{
		if(!isEmpty()) {
		 int e=arr[front+1];
		 front++;
		 return e;
		}
		return -1;
	}
	public int peek()
	{
		int e=arr[rear];
		return e;
	}
	public boolean isEmpty() {
		if(rear == front ||rear==-1)
			return true;
		return false;
	}
	public boolean isFull()
	{
		if(rear==size-1)
		{
			return true;
		}
		return false;
	}
	
}
public class Question3 {

	public static void main(String[] args) {
     Queue q=new Queue(5);
     q.push(1);
     q.push(2);
     q.push(3);
     q.push(4);
     q.push(5);
     System.out.println(q.peek());
     System.out.println(q.pop());
     System.out.println(q.peek());
     

	}

}
