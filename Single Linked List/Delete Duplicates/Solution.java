/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
    Node node = head;
  if(node == null) return head;
    while(node.next != null){
    if(node.data == node.next.data){
        node.next = node.next.next;
        }    
   else {
       node = node.next;
            }
    }
    return head;
}