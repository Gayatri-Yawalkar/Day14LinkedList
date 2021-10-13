package com.bridgelabz.linkedlist;
//Uc1
public class MyNode<T> implements INode<T>{
	private T key;
	private INode next;
	public MyNode(T key) {
		this.key=key;
		this.next=null;
	}
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key=key;
	}
	public void setNext(INode nextNode) {
		this.next=nextNode;
	}
	public INode getNext() {
		return next;
	}
}
