import java.security.PublicKey;
import java.util.*;


public class DataStructure {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Ds ");

//		int[] arr = {1,3,5,7,9,2,4,6,8};
//		array(arr);
		
//		LinkedListC list = new LinkedListC();
//		list.creatLinkedlist(5);
//		list.insertLinkedlist(35,2);
//		list.insertLinkedlist(15,1);
//		list.insertLinkedlist(7,3);
//		list.traverseLinkedlist();
//		list.serachLinked(15);
//		list.deleteLinked(3);
		  
	
//		Stack stack = new Stack();
//		stack.stackCreate(5);
//		stack.push(1);
//		stack.push(2);
//		stack.pop();
//		stack.peek();
		
//		Queue q = new Queue();
//		q.queueCreate(10);
//		q.isFull();
//		q.isEmpty();
//		q.enQueue(10);
//		q.deQueue();
//		q.enQueue(11);
//		q.peek();
		
//		BinaryTree bt = new BinaryTree();
//		bt.BinaryTreeCreate(11);
//		bt.insertTree("11");
//		bt.insertTree("12");
//		bt.insertTree("1");
//		bt.insertTree("2");
//		bt.levelOrder();

	
//		binarySearch bs = new binarySearch();
//		int[] arr = {1,2,4};
//		int val = bs.search(arr, 0, arr.length-1, 4);
//		System.out.println(val);
//		
		
	}
	
}

class binarySearch {
	
	public int search(int[] arr, int start, int end, int target) {
		
		int mid = ((end+start)/2);
		
		while(end >= start) {
			
			if(target == arr[mid]) { 
				return mid;
				
				//System.out.println( "value - " + mid);
			}else if(arr[mid] < target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
			mid = (start+end/2);
			
			
		}
		return -1;
		
	}
	
	
}

class BinaryTree{
	String[] arr;
	int lastindex;
	
	public void BinaryTreeCreate(int size) {
		arr = new String[size+1];
		this.lastindex = 0;
		System.out.println("Binary Tree is create with "+ size);
	}
	
    public void idFull(){
        if(arr.length-1 == lastindex){
            System.out.println("Binary tree is full");
        }
    }
    public void insertTree(String value){
        if(arr.length-1 != lastindex){
            arr[lastindex+1] = value;
            lastindex++;
        }
    }
    
    public void preOrder(int index) {
    	System.out.println("preOrder " + arr[index]);
    	preOrder(index*2);
    	preOrder(index*2+1);
    }
    public void inOrder(int index) {
    	inOrder(index*2);
    	System.out.println("InOrder " + arr[index]);
    	inOrder(index*2+1);
    }
    public void postOrder(int index) {
    	postOrder(index*2);
    	postOrder(index*2+1);
    	System.out.println("PostOrder " + arr[index]);
    }
    public void levelOrder() {
    	for(int i=0; i<lastindex; i++) {
    		System.out.println("Level Order " + arr[i]);
    	}
    }
    public void search(String value){
        for(int i=0; i<= lastindex; i++){
            if(arr[i] == value){
                System.out.println("Found the value is " + value + " at index " + i);
            }
        }
    }
    public void delete(String value){
        int location = 0;
        for(int i=0; i<=lastindex; i++){
            if(arr[i] == value){
                location = i;
            }
        }
        arr[location] = arr[lastindex];
        lastindex--;
        System.out.println("delete the Binary tree");
    }
    public void deleteTree(){
        arr = null;
        System.out.println("Binary tree deleted");
    }
}
	
class Queue{
	int [] arr;
	int top;
	int begin;
	
	public void queueCreate(int size) {
		this.arr = new int[size];
		this.top = -1;
		this.begin = -1;
		System.out.println("Queue is created with " + size);
	}
	
    public void isFull(){
        if(top == arr.length-1){
            System.out.println("Queue is full ");
        }
    }
    public void isEmpty(){
        if(begin==-1 || begin == arr.length){
            System.out.println("Queue is empty");
        }
    }
    public void enQueue(int value){
        if(begin == -1 || begin == arr.length){
            begin = 0;
            top++;
            arr[top] = value;
            System.out.println("Queue is created with value " + value);
        }else{
            top++;
            arr[top] = value;
            System.out.println("EnQueue " + value);
        }
    }
    public void deQueue(){
        int value = arr[begin];
        begin++;
        if(begin > top){
            begin = top = -1;
        }
        System.out.println("DeQueue " + value);
    }
    public void peek(){
        int data = arr[begin];
        System.out.println("peek " + data);
    }
	
}

class Node{
	int value;
	Node next;
}
class LinkedListC {
	Node tail;
	Node head; 
	int size;
	
	 public void creatLinkedlist(int val) {
		 head = new Node();
		 Node node = new Node();
		 node.value = val;
		 node.next = null;
		  
		 head = node;
		 tail = node;
		 size = 1;
	 }
	 public void traverseLinkedlist() {
		 Node temp = head;
		 if(head == null) {
			 System.out.println("Not exist");
			 
		 }else {
			 for(int i=0; i<size; i++) {
				 System.out.println(temp.value);
				 temp = temp.next;
			 }
		 }
	 }
	 
	 public void insertLinkedlist(int val, int location) {
		 Node node = new Node();
		 node.value = val;
		 
		 if(head == null) {
			 creatLinkedlist(val);
		 }else if(location>= size) {
			 node.next = null;
			 tail.next = node;
			 tail = node;
		 }else {
			 Node temp = head;
			 int index = 0;
			 while(index<location-1) {
				 temp = temp.next;
				 index++;
			 }
			 Node tempNode = temp.next;
			 temp.next = node;
			 node.next = tempNode;
		 }
		 size++;
		 
		 
	 }
	 
	 public void serachLinked(int nodeValue){
	        Node temp = head;
	        if(head == null){
	            System.out.println("LinkedList is null");
	        }else{
	            for(int i=0; i<size; i++){
	                if(temp.value == nodeValue){
	                    System.out.println("Node Value " + nodeValue + " found at " + i);
	                }
	                temp = temp.next;
	            }
	        }
	    }
	    
	    public void deleteLinked(int location){
	        if(location>= size){
	            Node temp = head;
	            for(int i=0; i<size-1; i++){
	                temp = temp.next;
	            }
	            
	            temp.next = null;
	            tail = temp;
	            size--;
	        }else{
	            Node temp = head;
	            for(int i=0; i<location-1; i++){
	                temp = temp.next;
	            }
	            temp.next = temp.next.next;
	            size--;
	        }
	    }	
}

class Stack{
	int[] arr;
	int topOfStack;
	
	public void stackCreate(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("Stack is created with "+ size);
	}
	
    
    public void isEmpty(){
        if(topOfStack == -1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Stack is not empty");
        }
    }
    
    public void isFull(){
        if(topOfStack == arr.length-1){
            System.out.println("Stack is full");
        }else{
            System.out.println("Stack is not full");
        }
    }
    
    public void push(int value){
        arr[topOfStack+1] = value;
        topOfStack++;
        System.out.println("pushed " + value);
    }
    public void pop(){
        int data = arr[topOfStack];
        topOfStack--;
        System.out.println("deleted " + data);
    }
    public void peek(){
        int data = arr[topOfStack];
        System.out.println("peek data " + data);
    }
    public void delete(){
        arr = null;
        System.out.println("deleted stack");
    }
    
    
	
}
	
