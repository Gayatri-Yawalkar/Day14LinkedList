package com.bridgelabz.linkedlist;
//Uc5
public class PopNode {
	public INode head;
	public INode tail;
	public PopNode() {
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
	public INode popFirstNode() {
		INode tempNode=this.head;
		this.head=this.head.getNext();
		return tempNode;
	}
	public void printNode(INode node) {
		StringBuffer sb=new StringBuffer("Popped Node: ");
		sb.append(node.getKey());
		System.out.println(sb);
	}
}
