package day_118;

public class Q4_Create_a_Node_Class_OOPs_in_Java_Constructors {

//	Create a Node class with following requirements
//
//	Two data members
//	i. data : int
//	ii. next : Node
//	A constructor which takes an integer parameter. This constructor should set data property and leave the next set to null.
//	A constructor which takes a Node parameter. This constructor should make a deep copy of the passed node.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public Node(Node node) {
		this.data = node.data;
		this.next = node.next;
	}
}
