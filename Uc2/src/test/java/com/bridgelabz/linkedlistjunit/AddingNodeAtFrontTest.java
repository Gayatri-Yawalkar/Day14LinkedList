package com.bridgelabz.linkedlistjunit;
//Uc2
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.bridgelabz.linkedlist.AddingNodeAtFront;
import com.bridgelabz.linkedlist.MyNode;
public class AddingNodeAtFrontTest {
	@Test
	public void given3Numbers_whenAddedToLinkedList_ShouldBeAddedToTop() {
		MyNode<Integer> firstNode=new MyNode<>(70);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(56);
		AddingNodeAtFront list=new AddingNodeAtFront();
		list.addNodeAtFront(firstNode);
		list.addNodeAtFront(secondNode);
		list.addNodeAtFront(thirdNode);
		boolean result=list.head.equals(thirdNode) && thirdNode.getNext().equals(secondNode) && list.tail.equals(firstNode);
		assertTrue(result);
		list.printMyNodes();
	}

}
