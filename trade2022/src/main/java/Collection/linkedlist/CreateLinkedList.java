package Collection.linkedlist;

 class Node
{
	 int first;
	 Node next;
	
}
 class Linked
 {

	public Node insert(int i, Node node) {
		if(node==null)
		{
			return getNewNode(i);
			
		}
		else
		{
			node.next=insert(i,node.next);
		}
		return node;
	}

	private Node getNewNode(int i) {
		Node a=new Node();
		a.first=i;
		a.next=null;
		return a;
	}
	 
 }
public class CreateLinkedList {

	public static void main(String[] args) {
		Node root=null;
		Linked l=new Linked();
		root =l.insert(10,root);
		root =l.insert(13,root);
		

	}

}
