package com.bridgelabz.linkedlistjunit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;
import com.bridgelabz.linkedlist.SearchNode;

public class SearchNodeTest {
	@Test
	public void given3Numbers_whenLastNumIsSearched_shoultReturnLastNum() {
		MyNode<Integer> firstNode=new MyNode<>(56);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(70);
		SearchNode<Integer> list=new SearchNode<>();
		list.appendNode(firstNode);
		list.appendNode(secondNode);
		list.appendNode(thirdNode);
		INode temp=list.searchNode(70);
		boolean result=temp.getKey().equals(thirdNode.getKey());
		assertTrue(result);
		
	}
}
