package com.bridgelabz.linkedlist;

public interface INode<T> {
	T getKey();
	void setKey(T key);
	INode getNext();
	void setNext(INode nextNode);

}
