package Assignment3;

class Queue{
	int count=0;
	int front=-1;
	int rear=-1;
	int size;
	int arr[];
	public Queue(int s)
	{
		size=s;
		arr=new int[size];
	}
	public boolean isEmpty()//front==rear && rear==-1
	{
		if(count==0)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()//front==rear && rear=Size-1  || front==rear && rear!=-1 
	{
		if(count==size)
		{
			return true;
		}
		return false;
	}
	public void push(int v)
	{
		if(isFull())
		{
			System.out.println("queue is full");
			return;
		}
		rear=(rear+1)%size;
		arr[rear]=v;
		count++;
	}
	public int pop()
	{
		if(isEmpty())
		{
			return -1;
		}
	    int val=arr[(front+1)%size]; 
		front=(front+1)%size;
		count--;
		return val;
	}
}
public class Question2 {

	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		q.push(6);
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		
		

	}

}
