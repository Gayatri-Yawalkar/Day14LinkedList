package com.bridgelabz.linkedlistjunit;
//Uc6
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;
import com.bridgelabz.linkedlist.PopLastNode;
public class PopLastNodeTest {
	@Test
	public void given3Numbers_whenLastNumIsPopped_secondNumShouldBecomeHead() {
		MyNode<Integer> firstNode=new MyNode<>(56);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(70);
		PopLastNode list=new PopLastNode();
		list.appendNode(firstNode);
		list.appendNode(secondNode);
		list.appendNode(thirdNode);
		list.printNodes();
		list.popLastNode();
		list.printNodes();
		boolean result=list.head.equals(firstNode) && firstNode.getNext().equals(secondNode) && list.tail.equals(secondNode);
		assertTrue(result);
		
	}
}
