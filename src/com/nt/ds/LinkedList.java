package com.nt.ds;

public class LinkedList {
	Node head;
	
	public void insertToLast(int data) {
		Node newNode= new Node();
		newNode.data = data;
		newNode.next= null;
		
		if(this.head ==null) {
			head=newNode;
		}else {
			Node n = head;
			while(n.next != null) {
				n=n.next;
			}
			n.next=newNode;
			
		}
	}
	public int listSize(LinkedList list) {
		Node n= list.head;
		int i=0;
		if(n != null) {
		i=1;
		while(n.next != null) {
			n=n.next;
			++i;
		}
		System.out.println();
		
		}
		
		return i;
	}
	
	public void insertAtIndex(int index, int data) {
		if(index==0) {
			insertAtFirst(data);
		}else {
		Node newNode = new Node();
		newNode.data=data;
		Node n = this.head;
		int i=0;
		while(n.next != null) {
			if(i==index-1) {
				newNode.next=n.next;
				n.next=newNode;
				break;
			}
			n=n.next;
			i++;
		}
		}
		
	}
	
	public void insertAtFirst(int data) {
		Node newNode = new Node();
		newNode.data=data;
		newNode.next = this.head;
		this.head =newNode;
	}
	
	public void printList(LinkedList list) {
		Node n = list.head;
		while(n.next != null) {
			System.out.print(n.data + "-->");
			n= n.next;
		}
		System.out.print(n.data);
	}
	
	public void deleteAt(int index) {
		if(index==0) {
			this.head=head.next;
		}
		
		Node n = this.head;
		int i=0;
		while(n.next !=null) {
			if(i==index-1) {
				Node n1 = n.next;
				n.next=n1.next;
				n1=null;
				break;
			}
			n=n.next;
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.listSize(list);
		list.insertToLast(10);
		list.insertToLast(20);
		list.insertToLast(30);
		
		list.insertToLast(40);
		list.insertAtFirst(5);
		
		list.insertAtIndex(3,0);
		list.printList(list);
		System.out.println(list.listSize(list));
		list.deleteAt(0);
		list.printList(list);
	}
	
	
}
