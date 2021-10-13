package com.bridgelabz.linkedlist;

public class AppendNode {
	public INode head;
	public INode tail;
	public AppendNode() {
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
}
