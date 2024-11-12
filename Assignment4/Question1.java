package Assignment4;

class LinkedList{
	static class Node{
		int data;
		Node next;
		public Node(int val)
		{
			data=val;
		}
	}
	   Node tail;
		public LinkedList()
		{
			tail=null;
		}
		
		public void addFirst(int v)
		{
			Node newNode=new Node(v);
			if(tail==null)
			{
				tail=newNode;
			}
			newNode.next=tail.next;
			tail.next=newNode;
		}
		public void addLast(int v)
		{
			Node newNode=new Node(v);
			if(tail==null)
			{
				tail=newNode;
			}
			else
			{
				newNode.next=tail.next;
				tail.next=newNode;
				tail=newNode;
			}
		}
		public void display()
		{
			Node trav=tail.next;
			do {
				System.out.println(trav.data);
				trav=trav.next;
			}
			while(trav!=tail.next);
		}
		public boolean addition(int k)
		{
			Node trav=tail;
			do {
				trav=trav.next;
				if(trav.data+trav.next.next.data==k)
				{
					return true;
				}
				
			}
			while(trav!=tail);
			return false;
		}
		
}

public class Question1 {

	public static void main(String[] args) {
		
     LinkedList list=new LinkedList();
     list.addFirst(3);
     list.addFirst(2);
     list.addFirst(1);
     list.addFirst(0);
     list.display();
     
    System.out.println(list.addition(3));
     
     
	}

}
