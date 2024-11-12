package Assignment4;
class LinkedList1
 {
	 static class Node{
		 int data;
		 Node next;
		 public Node(int d)
		 {
			 data=d;
		 }
	 }
	 Node head;
	 Node tail;
	 int top=-1;
	 public LinkedList1()
	 {
		 head=tail=null;
	 }
	 public void addFirst(int value)
		{
			Node newNode=new Node(value);
			newNode.next=head;
			head=newNode;
			top++;
		}
	 public int deleteFirst()
	 {
		 if(head.next==null)
		 {
			 head=null;
			 return -1;
		 }
		 int a=head.data;
		 head=head.next;
		 top--;
		return a;
	 }
	 public void addLast(int d)//push
	 {
		 Node newNode=new Node(d);
		 if(head==null && tail==null)
		 {
			 head=tail=newNode;
		 }
		 tail.next=newNode;
		 tail=newNode;
	 }
//	 public void deleteFirst()//pop
//	 {
//		 
//	 }
	 public void display()
	 {
		 Node trav=head;
		 while(trav!=null)
		 {
			 System.out.println(trav.data);
			 trav=trav.next;
		 }
	 }
 }
public class Question2 {

	public static void main(String[] args) {
		
		LinkedList1 stack=new LinkedList1();
		stack.addFirst(1);
		stack.addFirst(2);
		stack.addFirst(3);
		stack.addFirst(4);
		//stack.display();
		//System.out.println(stack.deleteFirst());
		LinkedList1 queue=new LinkedList1();
		queue.addLast(1);
		queue.addLast(2);
		queue.addLast(3);
		queue.addLast(4);
		queue.addLast(5);
         
		queue.display();
		System.out.println(queue.deleteFirst());
		
	}

}
