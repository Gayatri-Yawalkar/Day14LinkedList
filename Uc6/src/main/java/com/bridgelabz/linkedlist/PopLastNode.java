package com.bridgelabz.linkedlist;

public class PopLastNode {
	public INode head;
	public INode tail;
	public PopLastNode() {
		this.head=null;
		this.tail=null;
	}
	public void appendNode(INode node) {
		if(this.head==null) {
			this.head=node;
		}
		if(this.tail==null) {
			this.tail=node;
		} else {
			this.tail.setNext(node);
			this.tail=node;
		}
	}
	public void popLastNode() {
		INode tempNode=head;
		while(tempNode.getNext()!=null) {
			if(tempNode.getNext().equals(tail)) {
				this.tail=tempNode;
				break;
			}
			tempNode=tempNode.getNext();
		}
	}
	public void printNodes() {
		StringBuffer myNodes=new StringBuffer("My Nodes: ");
		INode tempNode=head;
		while(tempNode!=tail) {
			myNodes.append(tempNode.getKey());
			myNodes.append("-->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}