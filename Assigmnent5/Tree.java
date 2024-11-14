package Assigmnent5;

import java.util.Stack;

public class Tree {
	static class Node {
		int data;
		Node left = null;
		Node right = null;

		public Node(int val) {
			data = val;
		}
	}

	Node root = null;

	public void addNode(int v) {
		if (root == null) {
			root = new Node(v);
		} else {
			addNodeRecursion(v, root);
		}
	}

	public void addNodeRecursion(int v, Node trav) {
		if (v < trav.data) {
			if (trav.left == null) {
				trav.left = new Node(v);
				return;
			} else {
				addNodeRecursion(v, trav.left);
			}
		} else if (v > trav.data) {
			if (trav.right == null) {
				trav.right = new Node(v);
				return;
			} else {
				addNodeRecursion(v, trav.right);
			}
		}
	}

	public Node binarySearch(int v) {
		return binarySerchRecursive(v, root);
	}

	public Node binarySerchRecursive(int v, Node trav) {

		if (trav == null) {
			return null;
		}
		if (v == trav.data) {
			return trav;
		} else if (v < trav.data) {
			return binarySerchRecursive(v, trav.left);
		} else if (v > trav.data) {
			return binarySerchRecursive(v, trav.right);
		}
		return null;
	}

	public void DfsTraversal() {
		Stack<Node> s = new Stack<>();
		s.push(root);

		while (!s.isEmpty()) {
			Node temp = s.pop();
			System.out.print(" " + temp.data);
			if (temp.right != null) {
				s.push(temp.right);
			}
			if (temp.left != null) {
				s.push(temp.left);
			}
		}
		System.out.println();
	}

	public Node[] searchWithParent(int key) {
		Node parent = null;
		Node trav = root;
		if (root == null) {
			return null;
		}
		while (true) {
			if (trav.data == key) {
				return new Node[] { parent, trav };
			}
			parent = trav;
			if (key < trav.data) {
				trav = trav.left;
			} else if (key > trav.data) {
				
				trav = trav.right;
			}
		}

	}
	public void deleteNode(Node parent,Node trav)
	{
		if(trav==null)
		{
			return;
		}
		if(trav.left!=null && trav.right!=null)
		{
			parent=trav;
			Node pred=trav.left;
			
			while(pred.right!=null)
			{
				parent=pred;
				pred=pred.right;
			}
			trav.data=pred.data;
			trav=pred;
		}
		if(trav.left==null){
			if(trav==root)
			{
				root=trav.right;
			}
			else if(trav==parent.left)
			{
				parent.left=trav.right;
			}
			else if(trav==parent.right)
			{
				parent.right=trav.right;
			}
		}
		else {
			if(trav.right==null)
			{
				if(trav==root)
				{
					root=root.left;
				}
				else if(trav==parent.left)
				{
					parent.left=trav.left;
				}
				else if(trav==parent.right)
				{
					parent.right=trav.left;
				}
			}
		}
			
	}

	public static void main(String[] args) {
		Tree t = new Tree();
		t.addNode(10);
		t.addNode(8);
		t.addNode(12);
		t.addNode(11);
		t.addNode(7);
		t.addNode(15);
		t.addNode(8);
		t.DfsTraversal();
		Node arr[]=t.searchWithParent(7);
		Node temp=arr[1];
		if (temp == null) {
			System.out.println("not found");
		} else {
			t.deleteNode(arr[0],temp);
		}

		t.DfsTraversal();
	}

}
