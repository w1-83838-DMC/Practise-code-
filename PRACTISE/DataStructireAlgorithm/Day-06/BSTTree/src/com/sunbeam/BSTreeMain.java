package com.sunbeam;

public class BSTreeMain {
	public static void main(String[] args) {
		BSTree bstree = new BSTree();
		bstree.addNode(8);
		bstree.addNode(3);
		bstree.addNode(10);
		bstree.addNode(6);
		bstree.addNode(1);
		bstree.addNode(4);
		bstree.addNode(7);
		bstree.addNode(14);
		bstree.addNode(13);
		bstree.inorder();
		
		System.out.print("Height = "+ bstree.height());
		
	}

}
