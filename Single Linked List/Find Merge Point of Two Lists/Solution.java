/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    int lengthA = 0;
    int lengthB = 0;
    Node nodeA, nodeB;
    nodeA = headA;
    nodeB = headB;
    while(nodeA != null) {
        nodeA = nodeA.next;
        lengthA++;
    }
    while(nodeB != null) {
        nodeB = nodeB.next;
        lengthB++;
    }
    nodeA = headA;
    nodeB = headB;
    if(lengthA > lengthB) {
        int x = lengthA - lengthB;
        for(int i = 0; i < x; i++) {
            nodeA = nodeA.next;
        }
    } else {
        int x = lengthB - lengthA;
        for(int i = 0; i < x; i++) {
            nodeB = nodeB.next;
        }
    }
    while(nodeA != null) {
        if(nodeA == nodeB) return nodeA.data;
        nodeA = nodeA.next;
        nodeB = nodeB.next;
    }
    return 0;
}