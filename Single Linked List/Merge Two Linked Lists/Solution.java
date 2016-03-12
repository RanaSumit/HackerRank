/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node MergeLists(Node headA, Node headB) {
    Node sorted = new Node();
    if(headA == null) return headB;
    if(headB == null) return headA;
    if(headA.data <= headB.data) {
        sorted = headA;
        sorted.next = MergeLists(headA.next, headB);
    }
    else {
        sorted = headB;
        sorted.next = MergeLists(headA, headB.next);
    }
    return sorted;

}