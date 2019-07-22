package linkedList2;

public class LinkedList2 {
	public static class Node{
		Node next;
		int data;
		public Node(int data){
			this.data = data;
		}
	}
	public static class LinkedList{
		Node head;
		public void append(int data){
			if(head == null){
				head = new Node(data);
				return;
			}
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = new Node(data);
		}
	}
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.append(5);
		list.append(4);
		Node current = list.head;
		while(current.next != null){
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(current.data);
	}
}
