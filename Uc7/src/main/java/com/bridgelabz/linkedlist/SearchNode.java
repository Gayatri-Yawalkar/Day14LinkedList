package com.bridgelabz.linkedlist;
//Uc7
public class SearchNode<T> {
	public INode head;
	public INode tail;
	public SearchNode() {
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
	public INode<T> searchNode(T key) {
		INode<T> tempNode=head;
		while(tempNode.getNext()!=null) {
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode=tempNode.getNext();
		}
		if(tempNode.equals(tail)) {
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
		}
		return null;
	}
}
