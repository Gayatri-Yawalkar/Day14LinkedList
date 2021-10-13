package com.bridgelabz.linkedlistjunit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.linkedlist.AppendNode;
import com.bridgelabz.linkedlist.MyNode;

public class AppendNodeTest {
	public void given3Numbers_whenAppenedToLinkedList_ShouldBeAddedAtLast() {
		MyNode<Integer> firstNode=new MyNode<>(56);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(70);
		AppendNode list=new AppendNode();
		list.appendNode(firstNode);
		list.appendNode(secondNode);
		list.appendNode(thirdNode);
		boolean result=list.head.equals(firstNode) && firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode) && list.tail.equals(thirdNode);
		assertTrue(result);
	}
}
