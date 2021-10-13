package com.bridgelabz.linkedlist;
//Uc2
public class AddingNodeAtFront {
	public INode head;
	public INode tail;
	public AddingNodeAtFront() {
		this.head=null;
		this.tail=null;
	}
	public void addNodeAtFront(INode node) {
		if(this.head==null) {
			this.head=node;
		} else {
			INode tempNode=this.head;
			this.head=node;
			node.setNext(tempNode);
		}
		if(this.tail==null) {
			this.tail=node;
		} 
	}
	public void printMyNodes() {
		StringBuffer myNodes=new StringBuffer("My Nodes: ");
		INode tempNode=head;
		while(tempNode.getNext()!=null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) {
				myNodes.append("-->");
			}
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
