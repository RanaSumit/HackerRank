/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    if (headA == null && headB == null){
        return 1;
    }
    while (headA.data == headB.data){
        if(headA.next == null){
            if(headB.next == null){
                return 1;
            }
            else {
                return 0;
            }
        }
        headA = headA.next;
        headB = headB.next;
    }
    return 0;
}