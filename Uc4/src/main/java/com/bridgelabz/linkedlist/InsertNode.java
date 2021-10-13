package com.bridgelabz.linkedlist;

public class InsertNode {
	public INode head;
	public INode tail;
	public InsertNode() {
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
	public void insertNodeBetweenTwoNode(INode existingNode,INode newNode){
		INode tempNode=existingNode.getNext();
		newNode.setNext(tempNode);
		existingNode.setNext(newNode);
	}
}
