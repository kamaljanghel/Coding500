package Basic;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;


class Node{
    int value;
    Node next;
}

class ArrayC{
    public void arrayC(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}


/*
 * LinkedList
 */

class LinkedListC{
    Node tail;
    Node head;
    int size;
    
    public void createLinked(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        
        head = node;
        tail = node;
        size = 1;
    }
    public void insertLinked(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue; 
        if(head == null){
            createLinked(nodeValue);
        }else if(location>=size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else{
            Node temp = head;
            int index = 0;
            while(index < location-1){
                temp = temp.next;
                index++;
            }
            Node tempNode = temp.next;
            temp.next = node;
            node.next = tempNode;
        }
        size++;
    }
    
    public void traverseLinked(){
        Node temp = head;
        if(head == null){
            System.out.println("LinkedList not exist");
        }else{
            for(int i=0; i<size; i++){
                System.out.println("Linkedlist - " + temp.value);
                temp = temp.next;
            }
        }
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

/*
 * stack
 */

class stack{
    int[] arr;
    int topOfStack;
    
    public void stackC(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("stack is creatd with size " + size);
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

/*
 * Queue
 */


class Queue{
    int[] arr;
    int top;
    int begin;
    
    public void QueueC(int size){
        this.arr = new int[size];
        this.top = -1;
        this.begin = -1;
        System.out.println("Queue is created of " + size);
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

/*
 * Binary Tree
 */

class BinaryTree{
    String[] arr;
    int lastindex;
    
    public void BinaryTreeC(int size){
        arr = new String[size+1];
        this.lastindex = 0;
        System.out.println("Binary tree created " + size);
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
    public void preOrder(int index){
        System.out.println("preorder " + arr[index]);
        preOrder(index*2);
        preOrder(index*2 + 1);
    }
    public void inOrder(int index){
        inOrder(index*2);
        System.out.println("In Order " + arr[index]);
        inOrder(index*2 + 1);
    }
    public void postOrder(int index){
        postOrder(index*2);
        postOrder(index*2+1);
        System.out.println("post Order " + arr[index]);
    }
    public void levelOrder(){
        for(int i=0; i<lastindex; i++){
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

/*
 * Graph Implementation
 */
class GraphNode{
    String name;
    int index;
    
    public GraphNode(String name, int index){
        this.name = name;
        this.index = index;
    }
}

class Graph {
  ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
  int[][] adjacencyMatrix;

  public Graph(ArrayList<GraphNode> nodeList) {
    this.nodeList = nodeList;
    adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
  }

  public void addUndirectedEdge(int i, int j) {
    adjacencyMatrix[i][j] = 1;
    adjacencyMatrix[j][i] = 1;
  }

  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append(" :  ");
    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + " ");
    }
    s.append("\n");
    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + ": ");
      for (int j : adjacencyMatrix[i]) {
        s.append((j) + " ");
      }
      s.append("\n");
    }
    return s.toString();
  }
  
  // get Neighbors
  public ArrayList<GraphNode> getNeighbors(GraphNode node) {
    ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
    int nodeIndex = node.index;
    for (int i=0; i<adjacencyMatrix.length; i++) {
      if(adjacencyMatrix[nodeIndex][i]==1) {
        neighbors.add(nodeList.get(i));
      }
    }
    return neighbors;

  }

/*  // BSF internall
  void bfsVisit(GraphNode node) {
    LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
    queue.add(node);
    while(!queue.isEmpty()) {
      GraphNode currentNode = queue.remove(0);
      currentNode.isVisited = true;
      System.out.print(currentNode.name + " ");
      ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
      for (GraphNode neighbor: neighbors) {
        if (!neighbor.isVisited) {
          queue.add(neighbor);
          neighbor.isVisited = true;
        }
      }
    }
  }

  public void bfs() {
    for (GraphNode node : nodeList) {
      if(!node.isVisited) {
        bfsVisit(node);
      }
    }
  }

  void dfsVisit(GraphNode node) {
    Stack<GraphNode> stack = new Stack<>();
    stack.push(node);
    while(!stack.isEmpty()) {
      GraphNode currentNode = stack.pop();
      currentNode.isVisited = true;
      System.out.print(currentNode.name + " ");
      ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
      for (GraphNode neighbor : neighbors) {
        if (!neighbor.isVisited) {
          stack.push(neighbor);
          neighbor.isVisited = true;
        }
      }

    }
  }

  void dfs() {
    for (GraphNode node : nodeList) {
      if(!node.isVisited) {
        dfsVisit(node);
      }
    }
  }*/

}



class Codes {
    public static void main(String[] args) {
    /*
        int[] arr = {1,3,5,7,9,2,4,6,8};
        ArrayC ac = new ArrayC();
        ac.arrayC(arr);
    */
       LinkedListC lc = new LinkedListC();
        lc.createLinked(11);
        lc.insertLinked(4,1);
        lc.insertLinked(7,3);
        lc.insertLinked(5,9);
        lc.insertLinked(1,2);
        lc.deleteLinked(1);
        lc.traverseLinked();
        lc.serachLinked(7);  
    
    /*    
        stack st = new stack();
        st.stackC(5);
        st.push(1);
        st.push(2);
        st.pop();
    */
    /*
        Queue qu = new Queue();
        qu.QueueC(5);
        qu.enQueue(1);
        qu.enQueue(4);
        qu.enQueue(2);
        qu.deQueue();
        qu.isFull();
        qu.isEmpty();
        qu.peek();
    */
    /*
        BinaryTree bt = new BinaryTree();
        bt.BinaryTreeC(5);
        bt.insertTree("11");
        bt.insertTree("12");
        bt.insertTree("7");
        bt.levelOrder();
    */
	/*
	 ArrayList<GraphNode> nodelist = new ArrayList<GraphNode>();
        nodelist.add(new GraphNode ("A", 0));
        nodelist.add(new GraphNode ("B", 1));
        nodelist.add(new GraphNode ("C", 2));
        nodelist.add(new GraphNode ("D", 3));
        nodelist.add(new GraphNode ("E", 4));
        
        Graph g = new Graph(nodelist);
        g.addUndirectedEdge(0,1);
        g.addUndirectedEdge(0,2);
        g.addUndirectedEdge(0,3);
        g.addUndirectedEdge(1,4);
        g.addUndirectedEdge(2,3);
        g.addUndirectedEdge(3,4);
        System.out.println(g.toString());
    */
    /*
    BFS
    DFS
    
    */
    
    
    
        
    }
}	