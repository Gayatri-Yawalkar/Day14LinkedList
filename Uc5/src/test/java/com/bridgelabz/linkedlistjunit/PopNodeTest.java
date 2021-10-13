package com.bridgelabz.linkedlistjunit;
//Uc5
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;
import com.bridgelabz.linkedlist.PopNode;
public class PopNodeTest {
	@Test
	public void given3Numbers_whenFirstNumIsPopped_secondNumShouldBecomeHead() {
		MyNode<Integer> firstNode=new MyNode<>(56);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(70);
		PopNode list=new PopNode();
		list.appendNode(firstNode);
		list.appendNode(secondNode);
		list.appendNode(thirdNode);
		INode poppedNode=list.popFirstNode();
		printNode(poppedNode);
		boolean result=list.head.equals(secondNode) && secondNode.getNext().equals(thirdNode) && list.tail.equals(thirdNode);
		assertTrue(result);
		
	}
}
