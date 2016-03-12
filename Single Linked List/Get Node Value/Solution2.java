/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    Node nodeA = head;
    Node nodeB = head;
    for(int i = 0; i < n; i++) {
        nodeA = nodeA.next;
        
    }
      
    while(nodeA.next != null) {
        nodeA = nodeA.next;
        nodeB = nodeB.next;
    }
    return nodeB.data;
}