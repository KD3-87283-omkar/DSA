package Assignment3;

class LinkedList{
	
	static class Node{
		int data;
		Node next;
		public Node(int d)
		{
			data=d;
		}
	}
	Node head;
	public LinkedList()
	{
		head=null;
	}
	
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	public void addFirst(int value)
	{
		Node newNode=new Node(value);
		newNode.next=head;
		head=newNode;
	}
	public void addLast(int value)
	{
		Node newNode=new Node(value);
		if(isEmpty())
		{
			newNode.next=head;
			head=newNode;
		}
		Node trav=head;
		while(trav.next!=null)
		{
			trav=trav.next;
		}
		trav.next=newNode;
	}
	public void display()
	{
		Node trav=head;
		while(trav!=null)
		{
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
	}
}
public class Question3 {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);

		list.display();
		
		

	}

}
