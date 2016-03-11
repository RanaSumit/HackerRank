/*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) {
        if(head == null) // list does not exist..so no loop either.
        return 0;

    Node slow, fast; // create two references.

    slow = fast = head; // make both refer to the start of the list.

    while(true) {

        slow = slow.next;          // 1 hop.

        if(fast.next != null)
            fast = fast.next.next; // 2 hops.
        else
            return 0;          // next node null => no loop.

        if(slow == null || fast == null) // if either hits null..no loop.
            return 0;

        if(slow == fast) // if the two ever meet...we must have a loop.
            return 1;
    }
}