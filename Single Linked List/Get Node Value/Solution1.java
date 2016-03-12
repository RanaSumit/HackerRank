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
    int length = 0;
    Node node = head;
    while(node != null) {
        node = node.next;
        length++;
    }
    node = head;
    int position = length - n;
    for(int i = 0; i < position-1; i++) {
        node = node.next;
    }
    return node.data;

}