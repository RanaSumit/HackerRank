Node Insert(Node head, int data) {
	// Base case.
    if (head == null) {
        Node newNode = new Node();
        newNode.data = data;
        return newNode;
    }
    // Smaller problem instance.
    head.next = Insert(head.next, data);
    return head;
}