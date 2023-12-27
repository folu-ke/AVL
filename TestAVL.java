package project4;

import java.util.Iterator;
import java.util.LinkedList;

/**
* Main class used to test AVL.java
* @author  Mofoluwake Adesanya
* @version 12/20/2023
*/
public class TestAVL {
	public static void main(String[] args) throws CloneNotSupportedException {
		AVL<Integer> avl = new AVL<> ();
		// add
		System.out.println("// add");
		avl.add​(10); 
		avl.add​(20);
		avl.add​(30); 
		avl.add​(40);
		avl.add​(50); 
		avl.add​(25);
		System.out.println(avl);
		System.out.println("avl tree rep. ");
		avl.toStringTreeFormat();
		// test constructor 1
//		Integer[] number1 = {43, 50, 51, 53, 54, 67};
//		Integer[] number2 = {43, 50, 51, 53, 54, 60, 67};
		Integer[] number3 = {53, 50, 60, 43, 51, 54, 67};
		AVL<Integer> avl2 = new AVL (number3);
//		Character[] strings = {'K', 'D', 'P', 'B', 'J', 'M', 'A', 'L', 'O', 'N'};
//		BST<Character> charBST = new BST(strings);
		//new BST (number1);
//		BST<Integer> testBST2 = new BST (number2);
//		BST<Integer> testBST3 = new BST (number3);
//		System.out.println(testBST);
		// test size
		System.out.printf("size: %d \n", avl.size());
		// height
		System.out.printf("height: %d \n", avl.height());
		// addAll
		System.out.println("// addAll");
		LinkedList<Integer> list = new LinkedList<> ();
		list.add(55); list.add(60); list.add(69);
		System.out.println(list);
		//avl.addAll​(list);
		System.out.println(avl);
		System.out.printf("size: %d \n", avl.size());
		//test inorder iter
		System.out.println("// inorder iterator");
		Iterator<Integer> iter = avl.iterator();
		while ( iter.hasNext() ) {
			 System.out.println(iter.next());
		} // 
		// test preorder iter
		System.out.println("// preorder iterator");
		Iterator<Integer> iter1 = avl.preOrderIterator();
		while ( iter1.hasNext() ) {
			 System.out.println(iter1.next());
		} // 
		// test postorder iter
		System.out.println("// postorder iterator");
		Iterator<Integer> iter2 = avl.postOrderIterator();
		while ( iter2.hasNext() ) {
			 System.out.println(iter2.next());
		} // 
		// test toString
		System.out.println("// toString");		
		System.out.println(avl);
		// toArray
		System.out.println("// toArray");
		for ( Object value : avl.toArray() ) {
			System.out.println(value);
		}
		// test get
		System.out.println("// get");
		System.out.println(avl.get​(0));
		System.out.println(avl.get​(3));
		System.out.println(avl.get​(5));
		// test size
		System.out.printf("size: %d \n", avl.size());
		// test first and last
		System.out.println("// first and last");
		System.out.printf("first: %d ", avl.first());
		System.out.printf("last: %d \n", avl.last());
		// test height
		System.out.println("// height");
		System.out.println(avl.height());
		// contains
		System.out.println("// contains");
		System.out.println(avl.contains​(51));
		System.out.println(avl.contains​(10));
		System.out.println(avl.contains​(60));
		// remove
		System.out.println("// remove");
		avl.remove​(60);	avl.remove​(51);
//		testBST.remove​(43);	testBST.remove​(50);
//		testBST.remove​(54); testBST.remove​(53);
//		testBST.remove​(67);		
		System.out.println(avl);
		System.out.printf("size: %d \n", avl.size());
		// clone
		System.out.println("// clone");
		AVL<Integer> avl1 = avl.clone();
		AVL<Integer> avl4 = avl2.clone();
		// containsAll
		System.out.println("// containsAll");
		LinkedList<Integer> list1 = new LinkedList<> ();
		list1.add(43); list1.add(67); list1.add(51);  list1.add(44);
		System.out.println(list1);
		System.out.println(avl.containsAll​(list1));
		// ceiling
		System.out.println("// ceiling");
		System.out.println(avl.ceiling​(66));
		System.out.println(avl.ceiling​(44));
		System.out.println(avl.ceiling​(11));
		System.out.println(avl.ceiling​(81));
		// floor
		System.out.println("// floor");
		System.out.println(avl.floor​(66));
		System.out.println(avl.floor​(44));
		System.out.println(avl.floor​(11));
		System.out.println(avl.floor​(81));
		// lower
		System.out.println("// lower");
		System.out.println(avl.lower​(67)); // 60
		System.out.println(avl.lower​(44)); // 43	
		System.out.println(avl.lower​(11)); // null
		System.out.println(avl.lower​(81)); // 67
		// higher
		System.out.println("// higher");
		System.out.println(avl.higher​(66)); // 67
		System.out.println(avl.higher​(44)); // 50	
		System.out.println(avl.higher​(11)); // 43
		System.out.println(avl.higher​(81)); // null
		// equals 
		System.out.println("// equals");
		System.out.println(avl.equals(list1));
		System.out.println(avl.equals(avl1));
		System.out.println(avl.equals(avl2));
		System.out.println(avl.equals(avl4));
		System.out.println("// getRange");
		//System.out.println(testBST.getRange​(null, null));
		System.out.println(avl.getRange​(5, 43));
		System.out.println(avl.getRange​(54, 81));	
		// clear
		System.out.println("// clear");
		avl.clear();
		System.out.println(avl);
		System.out.printf("size: %d \n", avl.size());
		// toStringTreeFormat
		System.out.println("// toStringTreeFormat");
		System.out.println("AVL");
		System.out.println(avl.toStringTreeFormat());
		System.out.println("AVL clone");
		System.out.println(avl1.toStringTreeFormat());
		System.out.println("AVL2");
		System.out.println(avl2.toStringTreeFormat());
		System.out.println("AVL2 clone");
		System.out.println(avl4.toStringTreeFormat());
	}
}
