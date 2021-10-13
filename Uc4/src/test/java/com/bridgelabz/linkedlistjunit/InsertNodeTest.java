package com.bridgelabz.linkedlistjunit;
//Uc4
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.bridgelabz.linkedlist.AppendNode;
import com.bridgelabz.linkedlist.InsertNode;
import com.bridgelabz.linkedlist.MyNode;
public class InsertNodeTest {
	public void given3Numbers_whenOneNumInsertedBetweenTwoNum_shouldPassTest() {
		MyNode<Integer> firstNode=new MyNode<>(56);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(70);
		InsertNode list=new InsertNode();
		list.appendNode(firstNode);
		list.appendNode(thirdNode);
		list.insertNodeBetweenTwoNode(firstNode, secondNode);
		boolean result=list.head.equals(firstNode) && firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode) && list.tail.equals(thirdNode);
		assertTrue(result);
	}
}
