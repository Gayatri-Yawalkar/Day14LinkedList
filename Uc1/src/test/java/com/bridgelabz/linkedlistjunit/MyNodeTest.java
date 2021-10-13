package com.bridgelabz.linkedlistjunit;
//Uc1
import static org.junit.Assert.assertTrue;
//Uc1
import org.junit.Test;

import com.bridgelabz.linkedlist.MyNode;
public class MyNodeTest {
	@Test
	public void given3Numbers_WhenLinked_ShouldPassedLinkedListTest() {
		MyNode<Integer> firstNode=new MyNode<>(56);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result=firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
		assertTrue(result);
	}
}
