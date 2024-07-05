package com.sunbeam;

public class BsTreeMain {
	public static void main(String[] args) {
		BsTree bst= new BsTree();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(1);
		bst.addNode(6);
		bst.addNode(4);
		bst.addNode(7);
		bst.addNode(10);
		bst.addNode(14);
		bst.addNode(13);
		bst.preorder();
		bst.inorder();
		
		BsTree.Node ret= bst.binarySearch(8);
		if(ret!=null)
		{
			System.out.println("Key is found ");
		}else 
		{
			System.out.println("Key is not found ");
		}
		bst.inorder();
		bst.deleteNode(4);
		bst.inorder();
				
	}

}
